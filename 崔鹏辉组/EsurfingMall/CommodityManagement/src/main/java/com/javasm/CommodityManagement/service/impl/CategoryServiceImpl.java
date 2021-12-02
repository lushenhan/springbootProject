package com.javasm.CommodityManagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javasm.CommodityManagement.entity.Category;
import com.javasm.CommodityManagement.mapper.CategoryMapper;
import com.javasm.CommodityManagement.service.ICategoryService;
import org.springframework.stereotype.Service;
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
