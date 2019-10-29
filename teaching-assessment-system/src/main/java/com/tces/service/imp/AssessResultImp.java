package com.tces.service.imp;

import com.tces.mapper.TbAssessResultMapper;
import com.tces.mapper.TbAssessResultMapperCustom;
import com.tces.pojo.TbAssessResult;
import com.tces.pojo.TbAssessResultExample;
import com.tces.pojo.TbAssessResultVo;
import com.tces.service.AssessResult;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评教结果的CRUD
 */
@Service
public class AssessResultImp implements AssessResult {

    @Autowired
    private TbAssessResultMapper assessResultMapper;

    /**
     * 每当一个用户评教，就调用一次
     * 根据参数修改评分
     *
     * @param batchId   批次id
     * @param teacherId 老师的id
     * @param lessonId  课程的id
     * @param score     分数
     */
    @Override
    public void updateAssessResult(Integer batchId, Integer teacherId, Integer lessonId, Integer score) {
        // 创建查询条件，根据参数查询对应的评分记录
        TbAssessResultExample example = new TbAssessResultExample();
        TbAssessResultExample.Criteria criteria = example.createCriteria();
        criteria.andBatchIdEqualTo(batchId);
        criteria.andUserIdEqualTo(teacherId);
        criteria.andLessonIdEqualTo(lessonId);
        List<TbAssessResult> assessResults = assessResultMapper.selectByExample(example);

        // 判断这条记录是否存在
        if (assessResults != null && assessResults.size() > 0) {
            // 存在就修改分数
            TbAssessResult assessResult = assessResults.get(0);
            assessResult.setScore(assessResult.getScore() + score);
            assessResultMapper.updateByPrimaryKey(assessResult);
        } else {
            // 不存在就添加一条
            TbAssessResult assessResult = new TbAssessResult();
            assessResult.setBatchId(batchId);
            assessResult.setUserId(teacherId);
            assessResult.setLessonId(lessonId);
            assessResult.setScore(score);
            assessResultMapper.insert(assessResult);
        }
    }

    @Autowired
    private TbAssessResultMapperCustom assessResultMapperCustom;

    /**
     * 根据教师id查询
     *
     * @param userId
     * @return
     */
    @Override
    public Result findByUserId(Integer userId) {
        List<TbAssessResultVo> assessResultVos = assessResultMapperCustom.findScoreByUserId(userId);
        return Result.ok(assessResultVos);
    }
}
