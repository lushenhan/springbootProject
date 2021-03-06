package com.javasm.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javasm.commons.base.BaseController;
import com.javasm.commons.entity.AxiosResult;
import com.javasm.commons.entity.TableDatas;
import com.javasm.entity.ReviewRecord;
import com.javasm.service.IReviewRecordService;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/commodityManagement/review-record")
public class ReviewRecordController extends BaseController {
    @Resource
    private IReviewRecordService service;

    @GetMapping("{id}")
    public AxiosResult queryById(@PathVariable String id) {
        return suc(this.service.getById(id));
    }

    @GetMapping
    public TableDatas queryByPage(ReviewRecord obj) {
        startPage();
        List<ReviewRecord> list = this.service.list(new QueryWrapper<>(obj));
        return tableDatas(list);
    }

    @PostMapping
    public AxiosResult add(@RequestBody ReviewRecord obj) {
        return suc(this.service.save(obj));
    }

    @PutMapping
    public AxiosResult edit(@RequestBody ReviewRecord obj) {
        return suc(this.service.updateById(obj));
    }

    @DeleteMapping("{ids}")
    public AxiosResult deleteByIds(@PathVariable String ids) {
        String[] idsArray = ids.split(",");
        this.service.removeByIds(Arrays.asList(idsArray));
        return suc();
    }
}
