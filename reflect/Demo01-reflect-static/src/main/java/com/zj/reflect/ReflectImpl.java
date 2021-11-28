package com.zj.reflect;


import com.zj.services.Hello;
import com.zj.services.XiaoAiHelloImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhoujian
 */
public class ReflectImpl {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Hello hello = new XiaoAiHelloImpl();
//        获取方法，需要填写的是厂商的方法名字，和参数类型
        Method sayHello = hello.getClass().getMethod("sayHello", String.class);
//        执行指定的类中的方法，并且传递参数
        sayHello.invoke(hello, "周健");

    }
}
