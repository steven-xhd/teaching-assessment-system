package com.tces.service;

import com.tces.util.Result;

public interface AssessResult {
    void updateAssessResult(Integer batchId,Integer teacherId,Integer lessonId,Integer score);

    Result findByUserId(Integer userId);
}
