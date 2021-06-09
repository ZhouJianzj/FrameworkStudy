package com.zj.springbootservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.zj.springbootservlet.web")//启动servlet的注解
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
