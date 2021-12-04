package com.javasm.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

import java.time.LocalDateTime;

/**
 * @author:19
 * @date: 2021/12/4 17:25
 * @className: MyMetaHandler
 * @descrption:
 * @since: jdk1.8
 * @version: 0.1
 */

@Component
public class MyMetaHandler implements MetaObjectHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        LOGGER.info("start insert fill ......");
        this.setFieldValByName("createTime" , LocalDateTime.now() , metaObject);
        this.setFieldValByName("updateTime" , LocalDateTime.now() , metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        LOGGER.info("start update fill ......");
        this.setFieldValByName("updateTime" , LocalDateTime.now() , metaObject);
    }
}
