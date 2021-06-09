package com.zj.springbootofflogo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        需要换图标的话，需要在类路径下创建一个banner.txt的文件里面存放
        SpringApplication.run(Application.class, args);

////        不适用logo
//        SpringApplication springApplication = new SpringApplication(Application.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);

    }

}
