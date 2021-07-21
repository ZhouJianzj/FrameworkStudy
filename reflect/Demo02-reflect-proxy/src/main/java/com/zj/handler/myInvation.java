package com.zj.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhoujian
 * 为了动态代理，增强功能的
 */
public class myInvation implements InvocationHandler {
//    工厂对象,传递过来的是哪个工厂就给哪个工厂创建代理
    private Object object;

    public myInvation(Object object) {
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String str = "";
        if (object != null) {
//            调用的意思，注意传递的参数,返回值就是工厂实现的方法的返回值
            str = (String)method.invoke(object, args);
            System.out.println(method.getName());
//            下面是在实现基本的工厂功能的前提下，实现的增强
            str = str + ",hello！";
        }
        return str ;
    }
}
