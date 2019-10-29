package com.tces.mapper;

import com.tces.pojo.TbAssessResult;
import com.tces.pojo.TbAssessResultExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbAssessResultMapper {
    int countByExample(TbAssessResultExample example);

    int deleteByExample(TbAssessResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAssessResult record);

    int insertSelective(TbAssessResult record);

    List<TbAssessResult> selectByExample(TbAssessResultExample example);

    TbAssessResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAssessResult record, @Param("example") TbAssessResultExample example);

    int updateByExample(@Param("record") TbAssessResult record, @Param("example") TbAssessResultExample example);

    int updateByPrimaryKeySelective(TbAssessResult record);

    int updateByPrimaryKey(TbAssessResult record);
}