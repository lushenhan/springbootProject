package com.javasm.CommodityManagement.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javasm.CommodityManagement.entity.Goods;
import com.javasm.CommodityManagement.mapper.GoodsMapper;
import com.javasm.CommodityManagement.service.IGoodsService;
import org.springframework.stereotype.Service;
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
