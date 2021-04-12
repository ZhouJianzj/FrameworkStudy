package com.Jianzhou;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOne {
    @Test
    public void testOne(){
        String config = "springConfig.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println(name);
        }
    }
}
