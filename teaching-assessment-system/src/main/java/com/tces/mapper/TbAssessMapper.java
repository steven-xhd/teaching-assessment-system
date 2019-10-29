package com.tces.mapper;

import com.tces.pojo.TbAssess;
import com.tces.pojo.TbAssessExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbAssessMapper {
    int countByExample(TbAssessExample example);

    int deleteByExample(TbAssessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAssess record);

    int insertSelective(TbAssess record);

    List<TbAssess> selectByExample(TbAssessExample example);

    TbAssess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAssess record, @Param("example") TbAssessExample example);

    int updateByExample(@Param("record") TbAssess record, @Param("example") TbAssessExample example);

    int updateByPrimaryKeySelective(TbAssess record);

    int updateByPrimaryKey(TbAssess record);
}