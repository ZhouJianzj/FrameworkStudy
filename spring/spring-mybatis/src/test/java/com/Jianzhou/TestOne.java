package com.Jianzhou;

import com.Jianzhou.dao.BookDao;
import com.Jianzhou.entites.Book;
import com.Jianzhou.service.imple.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestOne {
    @Test
    public void testOne() {
        String config = "springConfig.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void testSelect() {
        String config = "springConfig.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //获取service层的实现类，去执行dao层的方法，里面涉及到自动按类型注入的注解
        BookServiceImpl bookServiceImpl = (BookServiceImpl) applicationContext.getBean("bookServiceImpl");
        List<Book> books = bookServiceImpl.doSelect();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void testInsert() {
        String config = "springConfig.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //mybatis整合spring之后会在dao包下自动的生成动态代理对象 默认的就是对象名字开头首字母的小写，所以下面bookServiceImpl
        BookServiceImpl bookServiceImpl = (BookServiceImpl) applicationContext.getBean("bookServiceImpl");
        Book book = (Book) applicationContext.getBean("book");
        book.setId(1002);
        book.setName("c语言基础");
        System.out.println(bookServiceImpl.doInsert(book));
    }
}
