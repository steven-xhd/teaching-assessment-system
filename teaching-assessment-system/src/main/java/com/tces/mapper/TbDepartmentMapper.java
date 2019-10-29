package com.tces.mapper;

import com.tces.pojo.TbDepartment;
import com.tces.pojo.TbDepartmentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbDepartmentMapper {
    int countByExample(TbDepartmentExample example);

    int deleteByExample(TbDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbDepartment record);

    int insertSelective(TbDepartment record);

    List<TbDepartment> selectByExample(TbDepartmentExample example);

    TbDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbDepartment record, @Param("example") TbDepartmentExample example);

    int updateByExample(@Param("record") TbDepartment record, @Param("example") TbDepartmentExample example);

    int updateByPrimaryKeySelective(TbDepartment record);

    int updateByPrimaryKey(TbDepartment record);
}