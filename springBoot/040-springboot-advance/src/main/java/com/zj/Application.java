package com.zj;

import com.zj.service.StuService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        返回的是一个容器
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
//       从容器中获取bean，并且调用方法
        StuService stuServiceImpl = (StuService) applicationContext.getBean("stuServiceImpl");
        System.out.println(stuServiceImpl.doFind());
    }

}
