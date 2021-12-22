package com.zj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zhoujian
 */
@SpringBootApplication
public class Demo01AdvanceApplication {


    @Value("${my.randonValue}")
    private String value;

    @Value("${my.randomInteger}")
    private Integer integer;

    @Value("${my.randomLong}")
    private long lL;

    @Value("${my.randomUuid}")
    private String uuid;

    @Value("${my.randomBignumber}")
    private int intRange;

    @Value("${my.random.in.range}")
    private int intRangeFromTo;

    @Value("${my.myValue}")
    private String myValue;

    public static void main(String[] args) {
        //方式一
        //SpringApplication.run(Demo01AdvanceApplication.class, args);

        //方式二:需要配置文件中指定启动类
        //ConfigurableApplicationContext context0 = new SpringApplication().run(args);
        //context0.getBean(ControllerT.class).mainTest();

        //方式三:流式编程
        Demo01AdvanceApplication bean = new SpringApplicationBuilder()
                .sources(Demo01AdvanceApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .run(args).getBean(Demo01AdvanceApplication.class);

        System.out.println(bean.value);
        System.out.println(bean.integer);
        System.out.println(bean.lL);
        System.out.println(bean.uuid);
        System.out.println(bean.intRange);
        System.out.println(bean.intRangeFromTo);
        System.out.println(bean.myValue);

    }

}
