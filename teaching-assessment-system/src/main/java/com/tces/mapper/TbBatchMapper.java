package com.tces.mapper;

import com.tces.pojo.TbBatch;
import com.tces.pojo.TbBatchExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbBatchMapper {
    int countByExample(TbBatchExample example);

    int deleteByExample(TbBatchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBatch record);

    int insertSelective(TbBatch record);

    List<TbBatch> selectByExample(TbBatchExample example);

    TbBatch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBatch record, @Param("example") TbBatchExample example);

    int updateByExample(@Param("record") TbBatch record, @Param("example") TbBatchExample example);

    int updateByPrimaryKeySelective(TbBatch record);

    int updateByPrimaryKey(TbBatch record);
}