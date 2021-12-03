package com.javasm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: JAVASM
 * @date: 2021/12/3 9:35
 * @className: BootApplication
 * @descrption:
 * @since: jbk1.8
 * @version: 0.1
 */
@SpringBootApplication
@MapperScan("com.javasm.*.mapper")
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }
}
