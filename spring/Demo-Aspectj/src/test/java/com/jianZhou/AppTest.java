package com.jianZhou;

import static org.junit.Assert.assertTrue;

import com.jianZhou.service.SomeServices;
import com.jianZhou.utils.CountTime;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
        public void testAspectJ(){
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取目标对象
        SomeServices services = (SomeServices) ac.getBean("services");
        //不需要获取切面类的对象，因为直接实在内存中生成好了
//        services.doOther();
        //测试的是后置通知标签 @AfterReturning(value = execution(),returning = "")
//        services.doSome();
        //测试的四JoinPoint参数的获取目标对象方法的一些信息的
//        services.doJoinPoint("zhouajian",20);
        services.doAround();
    }
}
