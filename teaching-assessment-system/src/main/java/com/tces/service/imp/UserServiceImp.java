package com.tces.service.imp;

import com.tces.mapper.TbClassinfoMapper;
import com.tces.mapper.TbDepartmentMapper;
import com.tces.mapper.TbRoleMapper;
import com.tces.mapper.TbUserMapper;
import com.tces.pojo.*;
import com.tces.service.UserService;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private TbUserMapper userMapper;

    @Autowired
    private TbRoleMapper roleMapper;

    @Autowired
    private TbClassinfoMapper classinfoMapper;

    @Autowired
    private TbDepartmentMapper departmentMapper;

    /**
     * 查询所有用户信息
     */
    @Override
    public List<TbUserCustom> findAll(Integer classId, Integer roleId) {

        // 查询条件
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        if (classId != null) {
            criteria.andClassIdEqualTo(classId);
        }
        if (roleId != null) {
            criteria.andRoleIdEqualTo(roleId);
        }
        criteria.andClassIdIsNotNull();
        // 查询用户的班级名称，院系，角色
        List<TbUser> userList = userMapper.selectByExample(example);
        return getTbUserCustoms(userList);
    }

    /**
     * 循环用户列表，包装用户列表并查询班级，院系名称，角色名称
     *
     * @param userList
     * @return
     */
    private List<TbUserCustom> getTbUserCustoms(List<TbUser> userList) {
        List<TbUserCustom> userCustomList = new ArrayList<>();
        TbUserCustom userCustom;
        for (TbUser user : userList) {
            userCustom = new TbUserCustom();
            // 角色
            TbRole role = roleMapper.selectByPrimaryKey(user.getRoleId());
            userCustom.setRoleName(role.getRoleName());
            // 班级
            if (user.getClassId() != null) {
                TbClassinfo classinfo = classinfoMapper.selectByPrimaryKey(user.getClassId());
                userCustom.setClassName(classinfo.getClassName());
            } else {
                userCustom.setClassName("无");
            }

            // 院系
            TbDepartment department = departmentMapper.selectByPrimaryKey(user.getDepId());
            userCustom.setDepName(department.getDepName());

            userCustom.setId(user.getId());
            userCustom.setClassId(user.getClassId());
            userCustom.setDepId(user.getDepId());
            userCustom.setPassword(user.getPassword());
            userCustom.setRoleId(user.getRoleId());
            userCustom.setStatus(user.getStatus());
            userCustom.setUsername(user.getUsername());

            userCustomList.add(userCustom);
        }
        return userCustomList;
    }

    /**
     * 根据id删除学生
     */
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            // 删除学生
            userMapper.deleteByPrimaryKey(id);
        }
    }

    /**
     * 修改用户信息
     */
    @Override
    public void update(TbUser user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * 添加用户
     */
    @Override
    public void insert(TbUser user) {
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        List<TbUser> users = userMapper.selectByExample(example);
        if (users != null && users.size() > 0) {
            throw new RuntimeException("该用户名已存在");
        }
        userMapper.insert(user);
    }


    @Override
    public TbUser findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据name模糊查询用户信息
     */
    @Override
    public List<TbUserCustom> findByNameLike(String name) {
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameLike("%" + name + "%");
        List<TbUser> userList = userMapper.selectByExample(example);
        // 查询用户详情
        return getTbUserCustoms(userList);
    }

    /**
     * 查询所有老师
     *
     * @return
     */
    @Override
    public List<TbUserCustom> findAllTeacher() {
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdEqualTo(3);
        List<TbUser> userList = userMapper.selectByExample(example);

        return getTbUserCustoms(userList);

    }

    @Override
    public Result selectByLogin(TbUser record) {
        if(userMapper.selectByLogin(record)==null){
            return new Result().fail("查询失败");
        }
        return new Result().ok(userMapper.selectByLogin(record));
    }
}
