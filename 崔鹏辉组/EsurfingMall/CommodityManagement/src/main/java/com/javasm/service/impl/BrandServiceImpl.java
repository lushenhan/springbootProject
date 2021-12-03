package com.javasm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javasm.entity.Brand;
import com.javasm.mapper.BrandMapper;
import com.javasm.service.IBrandService;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
