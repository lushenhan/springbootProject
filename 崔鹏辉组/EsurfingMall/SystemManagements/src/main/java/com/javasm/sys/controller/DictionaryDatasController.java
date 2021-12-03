package com.javasm.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import com.javasm.sys.service.IDictionaryDatasService;
import com.javasm.sys.entity.DictionaryDatas;

import org.springframework.web.bind.annotation.RestController;
import com.javasm.commons.base.BaseController;
import com.javasm.commons.entity.AxiosResult;
import com.javasm.commons.entity.TableDatas;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/sys/dictionarydatas")
public class DictionaryDatasController extends BaseController {
    @Resource
    private IDictionaryDatasService service;

    @GetMapping("{id}")
    public AxiosResult queryById(@PathVariable String id) {
        return suc(this.service.getById(id));
    }

    @GetMapping
    public TableDatas queryByPage(DictionaryDatas obj) {
        startPage();
        List<DictionaryDatas> list = this.service.list(new QueryWrapper<>(obj));
        return tableDatas(list);
    }

    @PostMapping
    public AxiosResult add(@RequestBody DictionaryDatas obj) {
        return suc(this.service.save(obj));
    }

    @PutMapping
    public AxiosResult edit(@RequestBody DictionaryDatas obj) {
        return suc(this.service.updateById(obj));
    }

    @DeleteMapping("{ids}")
    public AxiosResult deleteByIds(@PathVariable String ids) {
        String[] idsArray = ids.split(",");
        this.service.removeByIds(Arrays.asList(idsArray));
        return suc();
    }
}
