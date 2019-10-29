package com.tces.service.imp;

import com.tces.mapper.TbBatchMapper;
import com.tces.pojo.TbBatch;
import com.tces.pojo.TbBatchExample;
import com.tces.service.BatchService;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchServiceImp implements BatchService {

    @Autowired
    TbBatchMapper batchMapper;

    @Override
    public Result findAll() {
        List<TbBatch> batches = batchMapper.selectByExample(null);
        return Result.ok(batches);
    }

    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            batchMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void add(TbBatch batch) {
        batchMapper.insert(batch);
    }

    @Override
    public void update(TbBatch batch) {
        batchMapper.updateByPrimaryKeySelective(batch);
    }

    @Override
    public Result findById(Integer id) {
        TbBatch batch = batchMapper.selectByPrimaryKey(id);
        return Result.ok(batch);
    }

    @Override
    public Result findByNameLike(String name) {
        TbBatchExample example = new TbBatchExample();
        TbBatchExample.Criteria criteria = example.createCriteria();
        criteria.andBatchNameLike("%"+name+"%");
        List<TbBatch> batchList = batchMapper.selectByExample(example);
        return Result.ok(batchList);
    }
}
