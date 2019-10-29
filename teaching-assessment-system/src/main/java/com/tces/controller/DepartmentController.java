package com.tces.controller;

import com.tces.pojo.TbDepartment;
import com.tces.service.DepartmentService;
import com.tces.util.PageResult;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 查询所有学院，不分页
     */
    @RequestMapping("/findAll")
    public Result findAll() {
        List<TbDepartment> departmentList = departmentService.findAll();
        return new Result(200, "ok", departmentList);
    }


    /**
     * 查询所有学院(分页方式)
     *
     * @param page 当前页(从1开始)
     * @param rows 每页条数
     */
    @RequestMapping("/findPage")
    public Result findPage(Integer page, @RequestParam(defaultValue = "6") Integer rows) {
        PageResult pageResult = departmentService.findPage(page, rows);
        return new Result(200, "ok", pageResult);
    }

    /**
     * 删除
     * @param ids id的集合，可以批量删除
     */
    @RequestMapping(value = "/delete")
    public Result delete(@RequestParam("ids[]") int[] ids) {
        departmentService.delete(ids);
        return new Result(200, "ok", null);
    }

    /**
     * 添加一条院系记录
     * post方式
     */
    @RequestMapping(value = "/add")
    public Result add(TbDepartment department) {
        departmentService.add(department);
        return new Result(200, "ok", null);
    }

    /**
     * 修改院系信息
     * post方式
     */
    @RequestMapping(value = "/update")
    public Result update(TbDepartment department) {
        System.out.println(department.getId());
        departmentService.update(department);
        return new Result(200, "ok", null);
    }

    /**
     * 根据id查询院系
     */
    @RequestMapping("/findByid")
    public Result findByid(Integer id){
        TbDepartment department = departmentService.findById(id);
        return new Result(200,"ok", department);
    }
}
