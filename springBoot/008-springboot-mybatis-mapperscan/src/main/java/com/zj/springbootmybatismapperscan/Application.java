package com.zj.springbootmybatismapperscan;


import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 多个mapper的时候使用mapperScan
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zj.springbootmybatismapperscan.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
