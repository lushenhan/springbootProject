package com.javasm.CommodityManagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javasm.CommodityManagement.entity.Brand;
import com.javasm.CommodityManagement.mapper.BrandMapper;
import com.javasm.CommodityManagement.service.IBrandService;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
