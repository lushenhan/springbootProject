package com.javasm.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import com.javasm.sys.service.IUserService;
import com.javasm.sys.entity.User;
import org.springframework.web.bind.annotation.RestController;
import com.javasm.commons.entity.AxiosResult;
import com.javasm.commons.entity.TableDatas;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.github.pagehelper.page.PageMethod.startPage;
import static com.javasm.commons.entity.AxiosResult.suc;

@RestController
@RequestMapping("/sys/user")
public class UserController {
    @Resource
    private IUserService service;

    @GetMapping("{id}")
    public AxiosResult queryById(@PathVariable String id) {
        return suc(this.service.getById(id));
    }

    @GetMapping
    public TableDatas queryByPage(User obj) {
        startPage(1,2);
        List<User> list = this.service.list(new QueryWrapper<>(obj));
//        return tableDatas(list);
        return null;
    }


    @PostMapping
    public AxiosResult add(@RequestBody User obj) {
        return suc(this.service.save(obj));
    }

    @PutMapping
    public AxiosResult edit(@RequestBody User obj) {
        return suc(this.service.updateById(obj));
    }

    @DeleteMapping("{ids}")
    public AxiosResult deleteByIds(@PathVariable String ids) {
        String[] idsArray = ids.split(",");
        this.service.removeByIds(Arrays.asList(idsArray));
        return suc();
    }
}
