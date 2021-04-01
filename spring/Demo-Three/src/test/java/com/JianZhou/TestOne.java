package com.JianZhou;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOne {
    @Test
    public void testComp() {
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Object stu = ac.getBean("stu");
        System.out.println(stu);
    }
    @Test
    public  void testBook(){
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Object book = ac.getBean("book");
        System.out.println(book);
    }
    @Test
    public void testByName(){
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Object studentBook = ac.getBean("studentBook");
        System.out.println(studentBook);
    }
}
