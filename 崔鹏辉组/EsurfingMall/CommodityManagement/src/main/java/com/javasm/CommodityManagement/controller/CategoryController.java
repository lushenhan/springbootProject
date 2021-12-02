package com.javasm.CommodityManagement.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javasm.CommodityManagement.commons.base.BaseController;
import com.javasm.CommodityManagement.commons.entity.AxiosResult;
import com.javasm.CommodityManagement.commons.entity.TableDatas;
import com.javasm.CommodityManagement.entity.Category;
import com.javasm.CommodityManagement.service.ICategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/com.javasm.CommodityManagement/category")
public class CategoryController extends BaseController {
    @Resource
    private ICategoryService service;

    @GetMapping("{id}")
    public AxiosResult queryById(@PathVariable String id) {
        return suc(this.service.getById(id));
    }

    @GetMapping
    public TableDatas queryByPage(Category obj) {
        startPage();
        List<Category> list = this.service.list(new QueryWrapper<>(obj));
        return tableDatas(list);
    }

    @PostMapping
    public AxiosResult add(@RequestBody Category obj) {
        return suc(this.service.save(obj));
    }

    @PutMapping
    public AxiosResult edit(@RequestBody Category obj) {
        return suc(this.service.updateById(obj));
    }

    @DeleteMapping("{ids}")
    public AxiosResult deleteByIds(@PathVariable String ids) {
        String[] idsArray = ids.split(",");
        this.service.removeByIds(Arrays.asList(idsArray));
        return suc();
    }
}
