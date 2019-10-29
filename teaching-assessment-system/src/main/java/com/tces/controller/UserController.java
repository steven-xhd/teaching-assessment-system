package com.tces.controller;

import com.tces.pojo.TbUser;
import com.tces.pojo.TbUserCustom;
import com.tces.service.UserService;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有的学生，包括id，username，password，班级id，班级，学院id，学院，角色id，角色名
     */
    @RequestMapping("/findAll")
    public Result findAll(Integer classId, Integer roleId) {
        List<TbUserCustom> userList = userService.findAll(classId, roleId);
        return new Result(200, "ok", userList);
    }

    /**
     * 根据id删除用户
     * post方式
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)

    public Result delete(@RequestParam("ids[]") int[] ids) {
        System.out.println(ids.length);
        try {
            userService.delete(ids);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("删除失败");
        }
    }


    /**
     * 修改用户信息
     * post方式
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result update(TbUser user) {
        try {
            userService.update(user);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("修改失败");
        }
    }

    /**
     * 添加用户
     * post方式
     */
    @PostMapping("/add")
    public Result insert(TbUser user) {
        try {
            userService.insert(user);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(e.getMessage());
        }
    }

    /**
     * 模糊查询用户
     *
     * @param username
     */
    @GetMapping("/findByNameLike")
    public Result findByNameLike(String username) {
        List<TbUserCustom> userCustoms;
        try {
            userCustoms = userService.findByNameLike(username);
            return Result.ok(userCustoms);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("没有相关信息");
        }

    }

    /**
     * 查询所有老师
     */
    @GetMapping("/findAllTeacher")
    public Result findAllTeacher() {
        return Result.ok(userService.findAllTeacher());
    }
    /*
    * 登录
    * */
    @PostMapping("/login")
    public Result login(TbUser record){
        return  userService.selectByLogin(record);
    }
}
