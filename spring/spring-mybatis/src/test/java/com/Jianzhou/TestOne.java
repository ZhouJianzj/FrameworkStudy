package com.Jianzhou;

import com.Jianzhou.dao.BookDao;
import com.Jianzhou.entites.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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
    @Test
    public void testSelect(){
        String config = "springConfig.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        BookDao bookImple = (BookDao) applicationContext.getBean("bookDao");
        List<Book> books = bookImple.selectBook();

       for (Book book : books){
           System.out.println(book);
       }
    }
    @Test
    public void testInsert(){
        String config = "springConfig.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        BookDao bookImple = (BookDao) applicationContext.getBean("bookDao");
        Book book = (Book) applicationContext.getBean("book");
        book.setId(1002);
        book.setName("c语言基础");
        System.out.println(bookImple.insertBook(book));
    }
}
