package com.tces.mapper;

import com.tces.pojo.TbLesson;
import com.tces.pojo.TbLessonExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbLessonMapper {
    int countByExample(TbLessonExample example);

    int deleteByExample(TbLessonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLesson record);

    int insertSelective(TbLesson record);

    List<TbLesson> selectByExample(TbLessonExample example);

    TbLesson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLesson record, @Param("example") TbLessonExample example);

    int updateByExample(@Param("record") TbLesson record, @Param("example") TbLessonExample example);

    int updateByPrimaryKeySelective(TbLesson record);

    int updateByPrimaryKey(TbLesson record);

}