package com.tces.service;

import com.tces.pojo.TbRole;
import com.tces.util.PageResult;
import com.tces.util.Result;

import java.util.List;

public interface RoleService {

    List<TbRole> findAll();

    PageResult findPage(int page, int rows);

    void add(TbRole role);

    void delete(int[] ids);

    void update(TbRole role);

    TbRole findById(Integer id);

    Result findByNameLike(String name);
}
