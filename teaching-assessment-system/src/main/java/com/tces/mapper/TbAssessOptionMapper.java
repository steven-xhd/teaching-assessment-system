package com.tces.mapper;

import com.tces.pojo.TbAssessOption;
import com.tces.pojo.TbAssessOptionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbAssessOptionMapper {
    int countByExample(TbAssessOptionExample example);

    int deleteByExample(TbAssessOptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAssessOption record);

    int insertSelective(TbAssessOption record);

    List<TbAssessOption> selectByExample(TbAssessOptionExample example);

    TbAssessOption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAssessOption record, @Param("example") TbAssessOptionExample example);

    int updateByExample(@Param("record") TbAssessOption record, @Param("example") TbAssessOptionExample example);

    int updateByPrimaryKeySelective(TbAssessOption record);

    int updateByPrimaryKey(TbAssessOption record);
}