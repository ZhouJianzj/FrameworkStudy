package com.zj;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zhoujian
 */
@SpringBootApplication
public class Demo01AdvanceApplication {

    public static void main(String[] args) {
        //方式一
        //SpringApplication.run(Demo01AdvanceApplication.class, args);

        //方式二:需要配置文件中指定启动类
        //ConfigurableApplicationContext context0 = new SpringApplication().run(args);
        //context0.getBean(ControllerT.class).mainTest();

        //方式三:流式编程
        ConfigurableApplicationContext context1 = new SpringApplicationBuilder()
                .sources(Demo01AdvanceApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .run();




    }

}
