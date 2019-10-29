package com.tces.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tces.mapper.TbLessonMapper;
import com.tces.pojo.TbLesson;
import com.tces.pojo.TbLessonExample;
import com.tces.service.LessonService;
import com.tces.util.PageResult;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImp implements LessonService {

    @Autowired
    private TbLessonMapper lessonMapper;

    /**
     * 查询所有课程(不分页)
     */
    @Override
    public List<TbLesson> findAll() {

        return lessonMapper.selectByExample(null);
    }

    @Override
    public PageResult findPage(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<TbLesson> lessonList = lessonMapper.selectByExample(null);

        PageInfo<TbLesson> pageInfo = new PageInfo<>(lessonList);
        PageResult pageResult = new PageResult();
        pageResult.setData(pageInfo.getList());
        pageResult.setCount((int) pageInfo.getTotal());

        return pageResult;
    }

    @Override
    public void delete(int[] ids) {
        for (int id : ids) {
            lessonMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void add(TbLesson lesson) {
        lessonMapper.insert(lesson);
    }

    @Override
    public void update(TbLesson lesson) {
        lessonMapper.updateByPrimaryKeySelective(lesson);
    }

    @Override
    public TbLesson findById(Integer id) {
        return lessonMapper.selectByPrimaryKey(id);
    }

    @Override
    public Result findByNameLike(String name) {
        TbLessonExample example = new TbLessonExample();
        TbLessonExample.Criteria criteria = example.createCriteria();
        criteria.andLessonNameLike("%" + name + "%");
        List<TbLesson> lessonList = lessonMapper.selectByExample(example);
        return Result.ok(lessonList);
    }
}
