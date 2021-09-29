package com.zj.springbootjavaproject;

import com.zj.springbootjavaproject.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    /**
     * 这里run之后得到的是一个spring容器，类似ClassPathXMLContext一样的获取到有一个spring容器
     *
     * @param args
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        TestService testServiceImpl = (TestService) run.getBean("testServiceImpl");
        System.out.println(testServiceImpl.sayHell());

    }

}
