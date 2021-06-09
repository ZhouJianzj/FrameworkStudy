package com.zj.springboorcharacterencoding1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.zj.springboorcharacterencoding1.web")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
