package com.javasm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author:19
 * @date: 2021/12/3 15:35
 * @className: AppConfig
 * @descrption:
 * @since: jdk1.8
 * @version: 0.1
 */

@Configuration
@MapperScan("com.javasm.*.mapper")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class AppConfig {


}
