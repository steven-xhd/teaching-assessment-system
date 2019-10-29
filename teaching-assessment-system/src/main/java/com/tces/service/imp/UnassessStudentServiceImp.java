package com.tces.service.imp;

import com.tces.mapper.TbUnassessStudentMapper;
import com.tces.pojo.TbUnassessStudent;
import com.tces.service.UnassessStudentService;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnassessStudentServiceImp implements UnassessStudentService {

    @Autowired
    private TbUnassessStudentMapper unassessStudentMapper;

    /**
     * 添加
     * 当一个学生给对应的课程投票后，就将信息存入数据库
     * @param unassessStudent
     * @return
     */
    @Override
    public Result add(TbUnassessStudent unassessStudent) {
        try {
            unassessStudentMapper.insert(unassessStudent);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("添加失败");
        }

    }
}
