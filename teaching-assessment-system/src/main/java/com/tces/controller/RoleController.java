package com.tces.controller;

import com.tces.pojo.TbRole;
import com.tces.service.RoleService;
import com.tces.util.PageResult;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 查询所有角色(不分页)
     */
    @RequestMapping("/findAll")
    public Result findAll() {
        List<TbRole> roleList = roleService.findAll();
        return new Result(200, "ok", roleList);
    }

    /**
     * 查询所有角色(分页)
     *
     * @param page 当前页号从 1 开始
     * @param rows 每页条数
     */
    @RequestMapping("/findPage")
    public Result findPage(Integer page, @RequestParam(defaultValue = "6") Integer rows) {
        PageResult pageResult = roleService.findPage(page, rows);
        return new Result(200, "ok", pageResult);
    }

    /**
     * 添加角色
     * post方式
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result add(TbRole role) {
        try {
            roleService.add(role);
            return Result.ok();
        } catch (Exception e) {
            return Result.fail(e.getMessage());
        }

    }

    /**
     * 删除角色
     * post方式
     *
     * @param ids 角色id
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Result delete(@RequestParam("ids[]") int[] ids) {
        roleService.delete(ids);
        return new Result(200, "ok", null);
    }


    /**
     * 修改角色
     * post方式
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(TbRole role) {
        roleService.update(role);
        return new Result(200, "ok", null);
    }

    /**
     * 模糊查询
     */
    @GetMapping("/findByNameLike")
    public Result findByNameLike(String name) {
        return roleService.findByNameLike(name);
    }

}
