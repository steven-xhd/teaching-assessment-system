package com.tces.mapper;

import com.tces.pojo.TbClassinfo;
import com.tces.pojo.TbClassinfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbClassinfoMapper {
    int countByExample(TbClassinfoExample example);

    int deleteByExample(TbClassinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbClassinfo record);

    int insertSelective(TbClassinfo record);

    List<TbClassinfo> selectByExample(TbClassinfoExample example);

    TbClassinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbClassinfo record, @Param("example") TbClassinfoExample example);

    int updateByExample(@Param("record") TbClassinfo record, @Param("example") TbClassinfoExample example);

    int updateByPrimaryKeySelective(TbClassinfo record);

    int updateByPrimaryKey(TbClassinfo record);
}