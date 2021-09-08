package org.example;

import org.example.entity.User;
import org.example.server.TestServerImpl;
import org.example.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
       String config = "applicationContext-service.xml";
       ApplicationContext ac = new ClassPathXmlApplicationContext(config);
       UserServiceImpl userServiceImpl = (UserServiceImpl) ac.getBean("userServiceImpl");
        User user = userServiceImpl.get(1);
        System.out.println(user.toString());
    }
}
