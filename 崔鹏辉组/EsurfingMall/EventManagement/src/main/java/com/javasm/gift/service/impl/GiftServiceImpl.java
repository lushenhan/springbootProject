package com.javasm.gift.service.impl;

import com.javasm.gift.entity.Gift;
import com.javasm.gift.mapper.GiftMapper;
import com.javasm.gift.service.IGiftService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class GiftServiceImpl extends ServiceImpl<GiftMapper, Gift> implements IGiftService {

}
