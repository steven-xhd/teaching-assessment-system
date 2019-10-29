package com.tces.controller;

import com.tces.pojo.TbLessonInfo;
import com.tces.service.LessonInfoService;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/lessonInfo")
public class LessonInfoController {
    @Autowired
    private LessonInfoService lessonInfoService;

    /**
     * 查询批次记录，授课班级，课程名称，教师名称，教师的学院， 以及他们对应的id
     *
     * @return
     */
    @GetMapping("/findTeacherGiveLesson")
    public Result findTeacherGiveLesson() {
        return lessonInfoService.findTeacherAndLesson();
    }

    /**
     * 添加一条授课记录
     * post方式
     */
    @PostMapping("/add")
    public Result add(TbLessonInfo lessonInfo) {
        return lessonInfoService.add(lessonInfo);
    }

    /**
     * 删除
     * post方式
     */
    @PostMapping("/delete")
    public Result delete(@RequestParam("ids[]") int[] ids) {
        return lessonInfoService.delete(ids);
    }

    /**
     * 修改一条记录
     * post方式
     */
    @PostMapping("/update")
    public Result update(TbLessonInfo lessonInfo) {
        return lessonInfoService.update(lessonInfo);
    }

    /**
     * 根据班级id查询授课信息
     *
     * @param classId 班级id
     * @param studentId 学生的id
     */
    @GetMapping("/findLessonInfoByClassId")
    public Result findLessonInfoByClassId(Integer classId,HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        Integer studentId = null;
        if(cookies != null && cookies.length > 0){
            for (Cookie cookie:cookies) {
                System.out.println(cookie.getName()+cookie.getValue());
                if(cookie.getName().equals("studentId")){
                    studentId = Integer.parseInt(cookie.getValue());
                }

            }
        }
        return lessonInfoService.findLessonInfoByClassId(classId,studentId);
    }

}
