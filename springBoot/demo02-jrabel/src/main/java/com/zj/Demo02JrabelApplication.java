package com.zj;

import com.cn.TestBean;
import com.zj.web.Controller;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author zhoujian
 */
//exclude表示关闭这个自动配置，也可以在配置文件中配置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//SpringBootApplication可以被下面三个注解替换掉
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan

//导入指定的bean对象
@Import(TestBean.class)

public class Demo02JrabelApplication implements ApplicationRunner,CommandLineRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo02JrabelApplication.class, args);
        System.out.println(context.getBean(TestBean.class));
        System.out.println(context.getBean(Controller.class));
    }

    /**
     * 先：if判段的原因
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner-----------------------------------");
    }

    /**
     * 后
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner-----------------------------------");
    }
}
