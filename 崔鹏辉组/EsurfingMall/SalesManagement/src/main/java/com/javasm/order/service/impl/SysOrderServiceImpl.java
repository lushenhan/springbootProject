package com.javasm.order.service.impl;

import com.javasm.order.entity.SysOrder;
import com.javasm.order.mapper.SysOrderMapper;
import com.javasm.order.service.ISysOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysOrderServiceImpl extends ServiceImpl<SysOrderMapper, SysOrder> implements ISysOrderService {

}
