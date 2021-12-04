package com.javasm.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javasm.sys.entity.DictionaryDatas;
import org.springframework.web.bind.annotation.RequestMapping;
import com.javasm.sys.service.IDictionaryTypeService;
import com.javasm.sys.entity.DictionaryType;

import org.springframework.web.bind.annotation.RestController;
import com.javasm.commons.base.BaseController;
import com.javasm.commons.entity.AxiosResult;
import com.javasm.commons.entity.TableDatas;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sys/dictionarytype")
public class DictionaryTypeController extends BaseController {
    @Resource
    private IDictionaryTypeService service;

    @GetMapping("{id}")
    public AxiosResult queryById(@PathVariable String id) {
        return suc(this.service.getById(id));
    }

    @GetMapping
    public TableDatas queryByPage(DictionaryType obj) {
        startPage();
        List<DictionaryType> list = this.service.list(new QueryWrapper<>(obj));
        return tableDatas(list);
    }

    @GetMapping("list/{types}")
    public AxiosResult getDictDatasByTypes(@PathVariable String types){
        String[] split = types.split(",");
        Map<String , List<DictionaryDatas>> maps = service.queryByTypes(split);

        return suc(maps);
    }

    @PostMapping
    public AxiosResult add(@RequestBody DictionaryType obj) {
        return suc(this.service.save(obj));
    }

    @PutMapping
    public AxiosResult edit(@RequestBody DictionaryType obj) {
        return suc(this.service.updateById(obj));
    }

    @DeleteMapping("{ids}")
    public AxiosResult deleteByIds(@PathVariable String ids) {
        String[] idsArray = ids.split(",");
        this.service.removeByIds(Arrays.asList(idsArray));
        return suc();
    }
}
