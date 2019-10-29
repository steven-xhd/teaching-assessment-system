package com.tces.service.imp;

import com.tces.mapper.TbLessonInfoMapper;
import com.tces.mapper.TbLessonInfoMapperCustom;
import com.tces.mapper.TbUnassessStudentMapper;
import com.tces.mapper.TbUnassessStudentMapperCustom;
import com.tces.pojo.GiveLessons;
import com.tces.pojo.TbLessonInfo;
import com.tces.pojo.TbUnassessStudent;
import com.tces.service.LessonInfoService;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonInfoServiceImp implements LessonInfoService {

    @Autowired
    private TbLessonInfoMapper lessonInfoMapper;

    @Autowired
    private TbLessonInfoMapperCustom lessonInfoMapperCustom;

    /**
     * 查询授课信息
     *
     * @return
     */
    @Override
    public Result findTeacherAndLesson() {
        List<GiveLessons> teacherGiveLesson = lessonInfoMapperCustom.findTeacherGiveLesson(null, null);
        return Result.ok(teacherGiveLesson);
    }

    /**
     * 添加一条授课记录
     */
    @Override
    public Result add(TbLessonInfo lessonInfo) {
        lessonInfoMapper.insert(lessonInfo);
        return Result.ok();
    }

    /**
     * 修改授课记录
     *
     * @param lessonInfo
     * @return
     */
    @Override
    public Result update(TbLessonInfo lessonInfo) {
        lessonInfoMapper.updateByPrimaryKeySelective(lessonInfo);
        return Result.ok();
    }

    /**
     * 删除
     *
     * @param ids
     * @return
     */
    @Override
    public Result delete(int[] ids) {
        for (int id : ids) {
            lessonInfoMapper.deleteByPrimaryKey(id);
        }
        return Result.ok();
    }


    @Autowired
    private TbUnassessStudentMapper unassessStudentMapper;

    @Autowired
    private TbUnassessStudentMapperCustom unassessStudentMapperCustom;

    /**
     * 根据班级id查询还为评教的学生对应的任课教师的授课信息
     *
     * @param classId 班级id
     * @param userId  学生id
     */
    @Override
    public Result findLessonInfoByClassId(Integer classId, Integer userId) {
        List<TbUnassessStudent> unassessStudents = unassessStudentMapperCustom.findByBatchAndStudentId(userId);
        List<Integer> list = null;
        if (unassessStudents != null && unassessStudents.size() > 0) {
            list = new ArrayList<>();
            for (TbUnassessStudent unassessStudent : unassessStudents) {
                list.add(unassessStudent.getLessonId());
            }
        }

        List<GiveLessons> teacherGiveLesson = lessonInfoMapperCustom.findTeacherGiveLesson(classId, list);
        return Result.ok(teacherGiveLesson);
    }
}
