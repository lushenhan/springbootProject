package com.javasm.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javasm.commons.base.BaseController;
import com.javasm.commons.entity.AxiosResult;
import com.javasm.commons.entity.TableDatas;
import com.javasm.entity.Product;
import com.javasm.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("commodityManagement/product")
public class ProductController extends BaseController {
    @Resource
    private ProductService service;

    @GetMapping("{id}")
    public AxiosResult queryById(@PathVariable String id) {
        return suc(this.service.getById(id));
    }

    @GetMapping
    public TableDatas queryByPage(Product obj) {
        startPage();
        List<Product> products = this.service.list(new QueryWrapper<>(obj));
        return tableDatas(products);
    }

    @PostMapping
    public AxiosResult add(@RequestBody Product obj) {
        return suc(this.service.save(obj));
    }

    @PutMapping
    public AxiosResult edit(@RequestBody Product obj) {
        return suc(this.service.updateById(obj));
    }

    @DeleteMapping("{ids}")
    public AxiosResult deleteByIds(@PathVariable String ids) {
        String[] idsArray = ids.split(",");
        this.service.removeByIds(Arrays.asList(idsArray));
        return suc();
    }
}
