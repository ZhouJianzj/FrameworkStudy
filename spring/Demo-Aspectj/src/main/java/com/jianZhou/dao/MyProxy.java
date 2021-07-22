package com.jianZhou.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy  implements InvocationHandler {
    Object object;

    public MyProxy() {
    }

    public MyProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (object != null){
            doOne();
            Object invoke = method.invoke(object, args);
            doTwo();
            return invoke;
        }
        return null;
    }
    public void doOne(){
        System.out.println("----------------------");
    }
    public void doTwo(){
        System.out.println("+++++++++++++++++++++++");
    }
}
