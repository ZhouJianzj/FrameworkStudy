package com.jianZhou;


import com.jianZhou.service.SomeServices;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testAspectJ() {
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取目标对象
        SomeServices services = (SomeServices) ac.getBean("services");
        //不需要获取切面类的对象，因为直接实在内存中生成好了
//        services.doOther();

        //测试的是后置通知标签 @AfterReturning(value = execution(),returning = "")
//        String s = services.doSome();
//        System.out.println(s);

        //测试的四JoinPoint参数的获取目标对象方法的一些信息的
//        services.doJoinPoint("zhouajian",20);

//        services.doAround();

//        当异常发生的时候就会先执行这个然后再去抛出异常的错误信息
//        services.doException();
//        最终通知
//            services.doAfter();

//        poincut
        services.doPoinCut();
    }
}
