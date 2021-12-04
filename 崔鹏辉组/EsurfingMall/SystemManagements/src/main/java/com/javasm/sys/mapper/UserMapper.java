package com.javasm.sys.mapper;

import com.javasm.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> queryAll(User user);

}
