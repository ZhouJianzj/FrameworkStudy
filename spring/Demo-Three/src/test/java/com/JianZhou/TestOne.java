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
    @Test
    public void testResource(){
        //测试的是resource的默认的使用byName自动注入 需要resource的一个name属性，
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Object classstu = ac.getBean("classStu");
        System.out.println(classstu);
    }
    @Test
    public void  testAutoWriedRequired(){
        //测试使用AutoWired的时候使用required（需要）属性为false值的时候，没有匹配到的时候不会报错，默认的是true，没有匹配到的时候会报错
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Object pencli = ac.getBean("pencli");
        System.out.println(pencli);
    }
}
