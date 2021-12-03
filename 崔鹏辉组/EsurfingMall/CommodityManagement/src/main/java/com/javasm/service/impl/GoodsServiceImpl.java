package com.javasm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javasm.entity.Goods;
import com.javasm.mapper.GoodsMapper;
import com.javasm.service.IGoodsService;
import org.springframework.stereotype.Service;
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
