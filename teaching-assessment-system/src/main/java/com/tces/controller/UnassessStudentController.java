package com.tces.controller;

import com.tces.pojo.TbUnassessStudent;
import com.tces.service.UnassessStudentService;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/UnassessStudent")
public class UnassessStudentController {
    @Autowired
    private UnassessStudentService unassessStudentService;

    /**
     * 当一个学生给一门课程评教后，就将学生的id，课程的id，批次的id 存起来
     * @param unassessStudent
     * @return
     */
    @RequestMapping("/add")
    public Result add(TbUnassessStudent unassessStudent, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        Integer batchId = null;
        Integer studentId = null;
        Integer lessonId = null;
        if(cookies != null && cookies.length > 0){
            for (Cookie cookie:cookies) {
                System.out.println(cookie.getName()+cookie.getValue());
                if(cookie.getName().equals("batchId")){
                    batchId = Integer.parseInt(cookie.getValue());
                    unassessStudent.setBatchId(batchId);
                }
                if(cookie.getName().equals("studentId")){
                    studentId = Integer.parseInt(cookie.getValue());
                    unassessStudent.setStudentId(studentId);
                }
                if(cookie.getName().equals("lessonId")){
                    lessonId = Integer.parseInt(cookie.getValue());
                    unassessStudent.setLessonId(lessonId);
                }
            }
        }
        System.out.println(batchId+""+lessonId+""+studentId);
        if(batchId == null){
            return Result.fail("fail");
        }
        if (lessonId == null) {
            return Result.fail("fail");
        }
        if(studentId == null){
            return Result.fail("fail");
        }
        return unassessStudentService.add(unassessStudent);
    }
}
