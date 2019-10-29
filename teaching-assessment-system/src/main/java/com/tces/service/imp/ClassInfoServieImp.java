package com.tces.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tces.mapper.TbClassinfoMapper;
import com.tces.mapper.TbDepartmentMapper;
import com.tces.pojo.TbClassInfoCustom;
import com.tces.pojo.TbClassinfo;
import com.tces.pojo.TbClassinfoExample;
import com.tces.pojo.TbDepartment;
import com.tces.service.ClassInfoService;
import com.tces.util.PageResult;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassInfoServieImp implements ClassInfoService {

    @Autowired
    private TbClassinfoMapper classinfoMapper;

    @Override
    public List<TbClassinfo> findAll() {
        return classinfoMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);

        List<TbClassinfo> classinfoList = classinfoMapper.selectByExample(null);
        PageInfo<TbClassinfo> pageInfo = new PageInfo<>(classinfoList);

        PageResult pageResult = new PageResult();
        pageResult.setCount((int) pageInfo.getTotal());
        pageResult.setData(pageInfo.getList());

        return pageResult;
    }

    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            classinfoMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public void add(TbClassinfo classinfo) {
        classinfoMapper.insert(classinfo);
    }

    @Override
    public void update(TbClassinfo classinfo) {
        classinfoMapper.updateByPrimaryKeySelective(classinfo);
    }

    @Override
    public TbClassinfo findById(Integer id) {
        return classinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public Result findByNameLike(String name) {
        TbClassinfoExample example = new TbClassinfoExample();
        TbClassinfoExample.Criteria criteria = example.createCriteria();
        criteria.andClassNameLike(name + "%");
        List<TbClassinfo> classinfoList = classinfoMapper.selectByExample(example);
        // 包装班级和院系信息
        List<TbClassInfoCustom> classInfoCustoms = wrapperClassinfo(classinfoList);
        return Result.ok(classInfoCustoms);
    }


    @Autowired
    private TbDepartmentMapper departmentMapper;

    /**
     * 查询班级信息和院系名称
     */
    @Override
    public Result findClassAndDepName() {
        List<TbClassinfo> classinfoList = findAll();
        List<TbClassInfoCustom> classInfoCustoms = wrapperClassinfo(classinfoList);

        return Result.ok(classInfoCustoms);
    }

    /**
     * 包装院系和班级
     */
    private List<TbClassInfoCustom> wrapperClassinfo(List<TbClassinfo> classinfoList) {
        List<TbClassInfoCustom> classInfoCustoms = new ArrayList<>();
        TbClassInfoCustom classInfoCustom;
        for (TbClassinfo classinfo : classinfoList) {
            TbDepartment department = departmentMapper.selectByPrimaryKey(classinfo.getDepId());
            classInfoCustom = new TbClassInfoCustom();
            classInfoCustom.setId(classinfo.getId());
            classInfoCustom.setDepId(classinfo.getDepId());
            classInfoCustom.setClassName(classinfo.getClassName());
            classInfoCustom.setDepName(department.getDepName());
            classInfoCustoms.add(classInfoCustom);
        }
        return classInfoCustoms;
    }
}
