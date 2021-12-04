package com.javasm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author:19
 * @date: 2021/12/3 15:30
 * @className: ApplicationStart
 * @descrption:
 * @since: jdk1.8
 * @version: 0.1
 */


//@SpringBootApplication(scanBasePackages = "com.javasm")
@EnableAutoConfiguration
@SpringBootConfiguration
@ComponentScan(basePackages = "com.javasm")
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }

}
