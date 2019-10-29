package com.tces.controller;

import com.tces.service.AssessService;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assess")
public class AssessController {

    @Autowired
    private AssessService assessService;

    /**
     * 查询所有评教题目和选项
     *
     * @return
     */
    @RequestMapping("/findAssessAll")
    public Result findAssessAll() {
        return assessService.findAssessAll();
    }
}
