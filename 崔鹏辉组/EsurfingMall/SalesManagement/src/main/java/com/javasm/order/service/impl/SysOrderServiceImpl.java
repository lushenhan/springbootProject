package com.javasm.order.service.impl;

import com.alibaba.druid.sql.visitor.functions.If;
import com.baomidou.mybatisplus.core.injector.methods.SelectById;
import com.javasm.order.entity.SysOrder;
import com.javasm.order.mapper.SysOrderMapper;
import com.javasm.order.service.ISysOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class SysOrderServiceImpl extends ServiceImpl<SysOrderMapper, SysOrder> implements ISysOrderService {

}
