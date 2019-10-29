package com.tces.controller;

import com.tces.pojo.TbClassinfo;
import com.tces.service.ClassInfoService;
import com.tces.util.PageResult;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classinfo")
public class ClassInfoController {

    @Autowired
    private ClassInfoService classInfoService;

    /**
     * 查询全部班级
     *
     * @return
     */
    @GetMapping("/findAll")
    public Result findAll() {
        List<TbClassinfo> classinfoList = classInfoService.findAll();
        return new Result(200, "ok", classinfoList);
    }

    /**
     * 分页查询
     */
    @GetMapping("/findPage")
    public Result findPage(Integer page, @RequestParam(defaultValue = "6") Integer rows) {
        PageResult pageResult = classInfoService.findPage(page, rows);
        return new Result(200, "ok", pageResult);
    }

    /**
     * 根据id删除
     */
    @GetMapping("/delete")
    public Result delete(@RequestParam("ids[]") int[] ids) {
        classInfoService.delete(ids);
        return new Result(200, "ok", null);
    }

    /**
     * 修改班级
     * post
     */
    @PostMapping("/update")
    public Result update(TbClassinfo classinfo) {
        classInfoService.update(classinfo);
        return new Result(200, "ok", null);

    }

    /**
     * 添加班级
     * post
     */
    @PostMapping("/add")
    public Result add(TbClassinfo classinfo) {
        classInfoService.add(classinfo);
        return new Result(200, "ok", null);
    }

    /**
     * 模糊查询班级
     * @param name
     * @return
     */
    @GetMapping("/findByNameLike")
    public Result findByNameLike(String name){
        return classInfoService.findByNameLike(name);
    }

    /**
     * 查询班级名称和院系名称
     * @return
     */
    @GetMapping("/findClassAndDepName")
    public Result findClassAndDepName(){
        return classInfoService.findClassAndDepName();
    }
}
