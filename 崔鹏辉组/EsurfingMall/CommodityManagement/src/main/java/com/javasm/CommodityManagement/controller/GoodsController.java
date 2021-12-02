package com.javasm.CommodityManagement.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javasm.CommodityManagement.commons.base.BaseController;
import com.javasm.CommodityManagement.commons.entity.AxiosResult;
import com.javasm.CommodityManagement.commons.entity.TableDatas;
import com.javasm.CommodityManagement.entity.Goods;
import com.javasm.CommodityManagement.service.IGoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/com.javasm.CommodityManagement/goods")
public class GoodsController extends BaseController {
    @Resource
    private IGoodsService service;

    @GetMapping("{id}")
    public AxiosResult queryById(@PathVariable String id) {
        return suc(this.service.getById(id));
    }

    @GetMapping
    public TableDatas queryByPage(Goods obj) {
        startPage();
        List<Goods> list = this.service.list(new QueryWrapper<>(obj));
        return tableDatas(list);
    }

    @PostMapping
    public AxiosResult add(@RequestBody Goods obj) {
        return suc(this.service.save(obj));
    }

    @PutMapping
    public AxiosResult edit(@RequestBody Goods obj) {
        return suc(this.service.updateById(obj));
    }

    @DeleteMapping("{ids}")
    public AxiosResult deleteByIds(@PathVariable String ids) {
        String[] idsArray = ids.split(",");
        this.service.removeByIds(Arrays.asList(idsArray));
        return suc();
    }
}
