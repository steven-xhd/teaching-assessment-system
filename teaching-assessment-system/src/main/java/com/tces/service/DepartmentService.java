package com.tces.service;

import com.tces.pojo.TbDepartment;
import com.tces.util.PageResult;

import java.util.List;

public interface DepartmentService {

    List<TbDepartment> findAll();

    PageResult findPage(int page, int rows);

    void delete(int[] ids);

    void add(TbDepartment department);

    void update(TbDepartment department);

    TbDepartment findById(Integer id);
}
