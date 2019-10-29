package com.tces.controller;

import com.tces.pojo.TbLesson;
import com.tces.service.LessonService;
import com.tces.util.PageResult;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lesson")
public class LessonController {

    @Autowired
    private LessonService lessonService;


    /**
     * 查询所有课程(不分页)
     *
     * @return
     */
    @RequestMapping("/findAll")
    public Result findAll() {
        List<TbLesson> lessonList = lessonService.findAll();
        return new Result(200, "ok", lessonList);
    }

    /**
     * 查询所有课程(分页)
     *
     * @param page 当前页号
     * @param rows 每页条数
     */
    @RequestMapping("/findPage")
    public Result findPage(Integer page, @RequestParam(defaultValue = "6") Integer rows) {
        PageResult pageResult = lessonService.findPage(page, rows);
        return new Result(200, "ok", pageResult);
    }

    /**
     * 添加课程
     * post方式
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(TbLesson lesson) {
        lessonService.add(lesson);
        return new Result(200, "ok", null);
    }

    /**
     * 删除课程
     * post方式
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public Result delete(@RequestParam("ids[]") int[] ids) {
        lessonService.delete(ids);
        return new Result(200, "ok", null);
    }

    /**
     * 修改课程
     * post方式
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(TbLesson lesson) {
        lessonService.update(lesson);
        return new Result(200, "ok", null);
    }

    @RequestMapping("/findById")
    public Result findById(Integer id) {
        return new Result(200, "ok", lessonService.findById(id));
    }

    /**
     * 模糊查询课程
     *
     * @param name
     * @return
     */
    @GetMapping("/findByNameLike")
    public Result findByNameLike(String name) {
        return lessonService.findByNameLike(name);
    }
}
