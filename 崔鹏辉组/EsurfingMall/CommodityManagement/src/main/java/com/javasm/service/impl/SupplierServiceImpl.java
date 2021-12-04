package com.javasm.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javasm.entity.Supplier;
import com.javasm.mapper.SupplierMapper;
import com.javasm.service.ISupplierService;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper, Supplier> implements ISupplierService {

}
