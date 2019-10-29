package com.tces.service;

import com.tces.pojo.TbBatch;
import com.tces.util.Result;

public interface BatchService {
    Result findAll();

    void delete(int[] ids);

    void add(TbBatch batch);

    void update(TbBatch batch);

    Result findById(Integer id);

    Result findByNameLike(String name);
}
