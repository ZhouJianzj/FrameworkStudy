package com.zhouJian;

import com.zhouJian.dao.BookDao;
import com.zhouJian.entities.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestOne {
    /**
     * spring 的复习
     */
    @Test
    public void TestBookNew() {
        String config = "Spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Object book = ac.getBean("book");
        System.out.println(book.toString());
    }

    /**
     * mybatis的复习
     *
     * @throws IOException
     */
    @Test
    public void testMybatis() throws IOException {
        String config = "mybatis.xml";
        InputStream ac = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(ac);
        SqlSession sqlSession = factory.openSession();
        //不使用sqlid的方式去执行，而使用动态代理的方式
        BookDao mapper = sqlSession.getMapper(BookDao.class);
        List<Book> books = mapper.doSelect();
        books.forEach(book -> System.out.println(book));

    }

    @Test
    public void testdoInsert() throws IOException {
        String config = "mybatis.xml";
        InputStream ac = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(ac);
        //事务的自动提交，设置为false
        SqlSession sqlSession = factory.openSession(true);
        BookDao mapper = sqlSession.getMapper(BookDao.class);
        //获取对象
        String springConfig = "Spring.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springConfig);
        Book book = (Book) applicationContext.getBean("book");
        int i = mapper.doInsert(book);
        System.out.println(i);
    }
}
