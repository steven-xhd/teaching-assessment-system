package com.tces.mapper;

import com.tces.pojo.GiveLessons;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbLessonInfoMapperCustom {
    /**
     * 根据班级id查询教师的授课信息
     */
    List<GiveLessons> findTeacherGiveLesson(Integer classId,List lessonIds);
}