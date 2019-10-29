package com.tces.mapper;

import com.tces.pojo.TbLessonInfo;
import com.tces.pojo.TbLessonInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbLessonInfoMapper {
    int countByExample(TbLessonInfoExample example);

    int deleteByExample(TbLessonInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLessonInfo record);

    int insertSelective(TbLessonInfo record);

    List<TbLessonInfo> selectByExample(TbLessonInfoExample example);

    TbLessonInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLessonInfo record, @Param("example") TbLessonInfoExample example);

    int updateByExample(@Param("record") TbLessonInfo record, @Param("example") TbLessonInfoExample example);

    int updateByPrimaryKeySelective(TbLessonInfo record);

    int updateByPrimaryKey(TbLessonInfo record);
}