package com.tces.service.imp;

import com.tces.mapper.TbAssessMapper;
import com.tces.mapper.TbAssessOptionMapper;
import com.tces.mapper.TbAssessOptionRelevanceMapper;
import com.tces.pojo.*;
import com.tces.service.AssessService;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssessServiceImp implements AssessService {

    @Autowired
    private TbAssessMapper assessMapper;

    @Autowired
    private TbAssessOptionMapper assessOptionMapper;

    @Autowired
    private TbAssessOptionRelevanceMapper assessOptionRelevanceMapper;

    /**
     * 查询所有的评教数据和评教选项
     *
     * @return
     */
    @Override
    public Result findAssessAll() {

        List group = new ArrayList();

        // 查询测评选项的组
        TbAssessExample example = new TbAssessExample();
        TbAssessExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(0);
        List<TbAssess> assessGroup = assessMapper.selectByExample(example);
        example.clear();
        // 遍历父组
        for (TbAssess assess : assessGroup) {
            Map groupMap = new HashMap();

            criteria = example.createCriteria();
            criteria.andParentIdEqualTo(assess.getId());
            example.setOrderByClause("order_id");
            // 根据父组的id查询子组
            List<TbAssess> assessList = assessMapper.selectByExample(example);
            example.clear();

            TbAssessOptionRelevanceExample optionRelevanceExample = new TbAssessOptionRelevanceExample();
            TbAssessOptionRelevanceExample.Criteria criteria2 = optionRelevanceExample.createCriteria();
            criteria2.andAssessGroupIdEqualTo(assess.getId());
            List<TbAssessOptionRelevance> tbAssessOptionRelevances = assessOptionRelevanceMapper.selectByExample(optionRelevanceExample);
            TbAssessOptionRelevance relevance = tbAssessOptionRelevances.get(0);
            // 选择项的组id
            Integer optionGroupId = relevance.getAssessOptionGroupId();

            // 根据选择组的id去查选择项
            TbAssessOptionExample assessOptionExample = new TbAssessOptionExample();
            TbAssessOptionExample.Criteria criteria3 = assessOptionExample.createCriteria();
            criteria3.andOptionParentEqualTo(optionGroupId);
            assessOptionExample.setOrderByClause("order_id");
            List<TbAssessOption> assessOptionList = assessOptionMapper.selectByExample(assessOptionExample);

            List list = new ArrayList();
            // 给每一条评教添加选项
            for (TbAssess tbAssess : assessList) {
                Map map = new HashMap();
                map.put("title", tbAssess.getAssessName());
                map.put("option", assessOptionList);

                list.add(map);
            }

            groupMap.put("title", assess.getAssessName());
            groupMap.put("item", list);

            // 包装每一组数据
            group.add(groupMap);
        }

        return Result.ok(group);
    }
}
