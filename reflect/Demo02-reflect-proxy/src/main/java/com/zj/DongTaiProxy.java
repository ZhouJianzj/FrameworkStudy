package com.zj;

import com.zj.factory.HelloXiaoAiImpl;
import com.zj.handler.myInvation;
import com.zj.service.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhoujian
 * 创建并且调用创建好的动态代理对象
 */
public class DongTaiProxy {
    public static void main(String[] args) {
//        创建目标对象，也就是工厂
        Hello helloXiaoAiImpl = new HelloXiaoAiImpl();
//        创建调用对象的实现对象，也就是我们书写增强的代码的对象
        InvocationHandler invocationHandler = new myInvation(helloXiaoAiImpl);
//        制作动态代理对象,需要转换类型
        Hello makeProxy = (Hello) Proxy.newProxyInstance(helloXiaoAiImpl.getClass().getClassLoader(),
                helloXiaoAiImpl.getClass().getInterfaces(),
                invocationHandler);
        System.out.println(makeProxy.sayHello("周健"));
    }
}
