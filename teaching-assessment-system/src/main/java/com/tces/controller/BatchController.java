package com.tces.controller;

import com.tces.pojo.TbBatch;
import com.tces.service.BatchService;
import com.tces.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/batch")
public class BatchController {

    @Autowired
    BatchService batchService;

    /**
     * 查询所有批次
     */
    @GetMapping("/findAll")
    public Result findAll() {
        return batchService.findAll();
    }

    /**
     * 删除
     * post
     */
    @PostMapping("/delete")
    public Result delete(@RequestParam("ids[]") int[] ids) {
        try {
            batchService.delete(ids);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("删除失败");
        }
    }

    /**
     * 添加
     * post
     */
    @PostMapping("/add")
    public Result add(TbBatch batch) {
        try {
            batchService.add(batch);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("添加失败");
        }
    }

    /**
     * 修改
     * post
     */
    @PostMapping("/update")
    public Result update(TbBatch batch) {
        try {
            batchService.update(batch);
            return Result.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("修改失败");
        }
    }

    /**
     * 根据主键id查询
     */
    @GetMapping("/findById")
    public Result findById(Integer id) {
        return batchService.findById(id);
    }

    /**
     * 根据名称模糊查询
     */
    @GetMapping("/findByNameLike")
    public Result findByNameLike(String name) {
        return batchService.findByNameLike(name);
    }
}
