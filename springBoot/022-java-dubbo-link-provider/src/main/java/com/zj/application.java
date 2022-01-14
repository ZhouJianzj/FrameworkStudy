package com.zj;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class application {
    public static void main(String[] args) throws IOException {
        String config = "app.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(config);
        ac.start();
        System.in.read();
    }
}
