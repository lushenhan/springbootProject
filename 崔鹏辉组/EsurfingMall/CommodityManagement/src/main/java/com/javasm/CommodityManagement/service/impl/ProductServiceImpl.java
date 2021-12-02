package com.javasm.CommodityManagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javasm.CommodityManagement.entity.Product;
import com.javasm.CommodityManagement.mapper.ProductMapper;
import com.javasm.CommodityManagement.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
