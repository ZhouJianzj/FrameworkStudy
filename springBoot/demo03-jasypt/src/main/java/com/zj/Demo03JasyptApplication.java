package com.zj;

import com.zj.server.TestServer;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo03JasyptApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(Demo03JasyptApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

        TestServer bean = context.getBean(TestServer.class);
        System.out.println(bean.findUsers());

    }

}
