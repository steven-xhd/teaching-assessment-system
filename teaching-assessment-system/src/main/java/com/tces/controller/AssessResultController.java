package com.tces.controller;

import com.tces.service.AssessResult;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/assessResult")
public class AssessResultController {

    @Autowired
    private AssessResult assessResult;


    /**
     * 每当一个用户评教，就调用一次
     * 根据参数修改评分
     *
     * @param score 分数
     *              <p>
     *              post方式
     */

    @PostMapping("/updateScore")
    public Result updateScore(HttpServletRequest request, Integer score) {
        Cookie[] cookies = request.getCookies();
        Integer batchId = null;
        Integer teacherId = null;
        Integer lessonId = null;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + cookie.getValue());
                if (cookie.getName().equals("batchId")) {
                    batchId = Integer.parseInt(cookie.getValue());
                }
                if (cookie.getName().equals("userId")) {
                    teacherId = Integer.parseInt(cookie.getValue());
                }
                if (cookie.getName().equals("lessonId")) {
                    lessonId = Integer.parseInt(cookie.getValue());
                }
            }
        }
        System.out.println(batchId + "" + lessonId + "" + teacherId);
        if (batchId == null) {
            return Result.fail("fail");
        }
        if (lessonId == null) {
            return Result.fail("fail");
        }
        if (teacherId == null) {
            return Result.fail("fail");
        }
        assessResult.updateAssessResult(batchId, teacherId, lessonId, score);
        return Result.ok();
    }

    /**
     * 教师查看自己的分数
     *
     * @param userId 教师的id
     * @return
     */
    @GetMapping("/findScoreByUserId")
    public Result findScoreByUserId(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        Integer userId = null;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + cookie.getValue());
                if (cookie.getName().equals("studentId")) {
                    userId = Integer.parseInt(cookie.getValue());
                }
            }
        }
        System.out.println(userId);
        return assessResult.findByUserId(userId);
    }
}
