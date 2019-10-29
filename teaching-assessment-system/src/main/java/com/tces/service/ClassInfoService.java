package com.tces.service;

import com.tces.pojo.TbClassinfo;
import com.tces.util.PageResult;
import com.tces.util.Result;

import java.util.List;

public interface ClassInfoService {
    List<TbClassinfo> findAll();

    PageResult findPage(Integer page, Integer rows);

    void delete(int[] ids);

    void add(TbClassinfo classinfo);

    void update(TbClassinfo classinfo);

    TbClassinfo findById(Integer id);

    Result findByNameLike(String name);

    Result findClassAndDepName();
}
