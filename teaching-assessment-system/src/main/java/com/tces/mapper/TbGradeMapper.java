package com.tces.mapper;

import com.tces.pojo.TbGrade;
import com.tces.pojo.TbGradeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbGradeMapper {
    int countByExample(TbGradeExample example);

    int deleteByExample(TbGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbGrade record);

    int insertSelective(TbGrade record);

    List<TbGrade> selectByExample(TbGradeExample example);

    TbGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbGrade record, @Param("example") TbGradeExample example);

    int updateByExample(@Param("record") TbGrade record, @Param("example") TbGradeExample example);

    int updateByPrimaryKeySelective(TbGrade record);

    int updateByPrimaryKey(TbGrade record);
}