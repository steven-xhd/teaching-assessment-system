package com.tces.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tces.mapper.TbRoleMapper;
import com.tces.pojo.TbRole;
import com.tces.pojo.TbRoleExample;
import com.tces.service.RoleService;
import com.tces.util.PageResult;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色相关
 */
@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    private TbRoleMapper roleMapper;

    /**
     * 查询所有角色信息
     */
    @Override
    public List<TbRole> findAll() {
        return roleMapper.selectByExample(null);
    }

    /**
     * 分页查询
     *
     * @param page 当前页
     * @param rows 每页条数
     */
    @Override
    public PageResult findPage(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<TbRole> roles = roleMapper.selectByExample(null);
        PageInfo<TbRole> pageInfo = new PageInfo<>(roles);
        PageResult pageResult = new PageResult();
        pageResult.setCount((int) pageInfo.getTotal());
        pageResult.setData(pageInfo.getList());
        return pageResult;
    }

    /**
     * 添加角色
     */
    @Override
    public void add(TbRole role) {
        TbRoleExample example = new TbRoleExample();
        TbRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleNameEqualTo(role.getRoleName());
        List<TbRole> roles = roleMapper.selectByExample(example);
        if (roles != null && roles.size() > 0) {
            throw new RuntimeException("该角色已存在");
        }
        roleMapper.insert(role);
    }

    /**
     * 删除角色
     */
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            roleMapper.deleteByPrimaryKey(id);
        }
    }

    /**
     * 修改角色信息
     */
    @Override
    public void update(TbRole role) {
        roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public TbRole findById(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据名称模糊查询
     *
     * @param name
     * @return
     */
    @Override
    public Result findByNameLike(String name) {
        TbRoleExample example = new TbRoleExample();
        TbRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleNameLike("%" + name + "%");
        List<TbRole> roleList = roleMapper.selectByExample(example);
        return Result.ok(roleList);
    }
}
