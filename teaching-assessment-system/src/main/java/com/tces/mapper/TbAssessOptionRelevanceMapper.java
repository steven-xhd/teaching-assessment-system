package com.tces.mapper;

import com.tces.pojo.TbAssessOptionRelevance;
import com.tces.pojo.TbAssessOptionRelevanceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbAssessOptionRelevanceMapper {
    int countByExample(TbAssessOptionRelevanceExample example);

    int deleteByExample(TbAssessOptionRelevanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAssessOptionRelevance record);

    int insertSelective(TbAssessOptionRelevance record);

    List<TbAssessOptionRelevance> selectByExample(TbAssessOptionRelevanceExample example);

    TbAssessOptionRelevance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAssessOptionRelevance record, @Param("example") TbAssessOptionRelevanceExample example);

    int updateByExample(@Param("record") TbAssessOptionRelevance record, @Param("example") TbAssessOptionRelevanceExample example);

    int updateByPrimaryKeySelective(TbAssessOptionRelevance record);

    int updateByPrimaryKey(TbAssessOptionRelevance record);
}