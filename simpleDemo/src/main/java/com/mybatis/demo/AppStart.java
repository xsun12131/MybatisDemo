package com.mybatis.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author xuyangyang
 * @Date 2021/11/15 14:23
 */
@SpringBootApplication
@MapperScan(basePackages = "com.mybatis.demo.dao")
public class AppStart {

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class, args);
    }

}
