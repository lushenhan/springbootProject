package com.javasm.sys.service.impl;

import com.javasm.sys.entity.User;
import com.javasm.sys.mapper.UserMapper;
import com.javasm.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


}
