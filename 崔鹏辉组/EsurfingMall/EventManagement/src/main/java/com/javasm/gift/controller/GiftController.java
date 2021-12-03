package com.javasm.gift.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javasm.commons.base.BaseController;
import com.javasm.commons.entity.TableDatas;
import org.springframework.web.bind.annotation.RequestMapping;
import com.javasm.gift.service.IGiftService;
import com.javasm.gift.entity.Gift;
import org.springframework.web.bind.annotation.RestController;
import com.javasm.commons.entity.AxiosResult;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/eventManagement/gift")
public class GiftController extends BaseController {
    @Resource
    private IGiftService service;


    @GetMapping("list1")
    public AxiosResult queryAll(Gift list){
        QueryWrapper w = new QueryWrapper<>(list);
        List list1 = service.list(w);
        return suc(list1);
    }


    @GetMapping("{id}")
    public AxiosResult queryById(@PathVariable String id) {
        return suc(this.service.getById(id));
    }


    @GetMapping
    public TableDatas queryByPage(Gift obj) {
        startPage();
        List<Gift> list = this.service.list(new QueryWrapper<>(obj));
//        TableDatas tb = new TableDatas(list);
        return tableDatas(list);

    }

    @PostMapping
    public AxiosResult add(@RequestBody Gift obj) {
        return suc(this.service.save(obj));
    }

    @PutMapping
    public AxiosResult edit(@RequestBody Gift obj) {
        return suc(this.service.updateById(obj));
    }

    @DeleteMapping("{ids}")
    public AxiosResult deleteByIds(@PathVariable String ids) {
        String[] idsArray = ids.split(",");
        this.service.removeByIds(Arrays.asList(idsArray));
        return suc();
    }
}
