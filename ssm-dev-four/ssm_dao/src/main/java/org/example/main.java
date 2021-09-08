package org.example;

import org.example.server.TestServerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
       String config = "applicationContext-dao.xml";
       ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        TestServerImpl testServerImpl = (TestServerImpl) ac.getBean("testServerImpl");
        testServerImpl.testGet();
    }
}
