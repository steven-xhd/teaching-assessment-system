package com.tces.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tces.mapper.TbDepartmentMapper;
import com.tces.pojo.TbDepartment;
import com.tces.service.DepartmentService;
import com.tces.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    private TbDepartmentMapper departmentMapper;


    @Override
    public List<TbDepartment> findAll() {
        return departmentMapper.selectByExample(null);
    }

    /**
     * 查询所有学院(分页)
     *
     * @param page
     * @param rows
     * @return
     */
    @Override
    public PageResult findPage(int page, int rows) {

        PageHelper.startPage(page, rows);

        List<TbDepartment> departmentList = departmentMapper.selectByExample(null);
        PageInfo<TbDepartment> pageInfo = new PageInfo<>(departmentList);
        PageResult pageResult = new PageResult();
        pageResult.setData(pageInfo.getList());
        pageResult.setCount((int) pageInfo.getTotal());

        return pageResult;
    }

    /**
     * 根据id删除院系
     *
     * @param ids
     */
    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            departmentMapper.deleteByPrimaryKey(id);
        }
    }

    /**
     * 添加院系记录
     */
    @Override
    public void add(TbDepartment department) {
        departmentMapper.insert(department);
    }

    /**
     * 根据主键修改院系
     */
    @Override
    public void update(TbDepartment department) {
        departmentMapper.updateByPrimaryKeySelective(department);
    }


    @Override
    public TbDepartment findById(Integer id) {
        return departmentMapper.selectByPrimaryKey(id);
    }
}
