package com.javasm.order.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import com.javasm.order.service.ISysOrderService;
import com.javasm.order.entity.SysOrder;

import org.springframework.web.bind.annotation.RestController;
import com.javasm.commons.base.BaseController;
import com.javasm.commons.entity.AxiosResult;
import com.javasm.commons.entity.TableDatas;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/order/sysorder")
public class SysOrderController extends BaseController {
    @Resource
    private ISysOrderService service;

    @GetMapping("{id}")
    public AxiosResult queryById(@PathVariable String id) {
        return suc(this.service.getById(id));
    }

    @GetMapping
    public AxiosResult queryByPage(SysOrder obj) {
        startPage();
        List<SysOrder> list = this.service.list(new QueryWrapper<>(obj));
        return suc(tableDatas(list));
    }

    @PostMapping
    public AxiosResult add(@RequestBody SysOrder obj) {
        return suc(this.service.save(obj));
    }

    @PutMapping
    public AxiosResult edit(@RequestBody SysOrder obj) {
        return suc(this.service.updateById(obj));
    }

    @DeleteMapping("{ids}")
    public AxiosResult deleteByIds(@PathVariable String ids) {
        String[] idsArray = ids.split(",");
        this.service.removeByIds(Arrays.asList(idsArray));
        return suc();
    }
}
