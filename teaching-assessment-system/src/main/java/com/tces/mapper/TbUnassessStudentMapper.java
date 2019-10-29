package com.tces.mapper;

import com.tces.pojo.TbUnassessStudent;
import com.tces.pojo.TbUnassessStudentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbUnassessStudentMapper {
    int countByExample(TbUnassessStudentExample example);

    int deleteByExample(TbUnassessStudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUnassessStudent record);

    int insertSelective(TbUnassessStudent record);

    List<TbUnassessStudent> selectByExample(TbUnassessStudentExample example);

    TbUnassessStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUnassessStudent record, @Param("example") TbUnassessStudentExample example);

    int updateByExample(@Param("record") TbUnassessStudent record, @Param("example") TbUnassessStudentExample example);

    int updateByPrimaryKeySelective(TbUnassessStudent record);

    int updateByPrimaryKey(TbUnassessStudent record);
}