package com.tces.service;

import com.tces.pojo.TbLessonInfo;
import com.tces.util.Result;

public interface LessonInfoService {
    Result findTeacherAndLesson();

    Result add(TbLessonInfo lessonInfo);

    Result update(TbLessonInfo lessonInfo);

    Result delete(int[] ids);

    Result findLessonInfoByClassId(Integer classId,Integer userId);
}
