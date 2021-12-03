package com.javasm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javasm.entity.Product;
import com.javasm.mapper.ProductMapper;
import com.javasm.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
