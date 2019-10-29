package com.tces.service;

import com.tces.pojo.TbLesson;
import com.tces.util.PageResult;
import com.tces.util.Result;

import java.util.List;

public interface LessonService {

    List<TbLesson> findAll();

    PageResult findPage(int page, int rows);

    void delete(int[] ids);

    void add(TbLesson lesson);

    void update(TbLesson lesson);

    TbLesson findById(Integer id);

    Result findByNameLike(String name);
}
