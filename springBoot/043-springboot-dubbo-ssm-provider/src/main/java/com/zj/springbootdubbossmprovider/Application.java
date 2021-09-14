package com.zj.springbootdubbossmprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
//        TestService testService = (TestService) run.getBean("testService");
//        System.out.println(testService.testMybatis());
//        System.out.println(testService.testRedis());

    }

}
