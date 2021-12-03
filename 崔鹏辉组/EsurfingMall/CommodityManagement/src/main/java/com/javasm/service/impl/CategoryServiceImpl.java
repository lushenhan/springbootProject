package com.javasm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javasm.entity.Category;
import com.javasm.mapper.CategoryMapper;
import com.javasm.service.ICategoryService;
import org.springframework.stereotype.Service;
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
