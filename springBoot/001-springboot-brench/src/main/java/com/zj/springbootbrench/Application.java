package com.zj.springbootbrench;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springBoot的入口类，main方法就是入口函数，也是启动项目的核心
 * SpringBootApplication：这个注解是启动 自动配置的
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
