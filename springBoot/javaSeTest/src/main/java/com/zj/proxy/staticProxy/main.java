package com.zj.proxy.staticProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//      第一种方法  new StaticProxy(new ServiceImpl()).doService();
//       第二种方法
        Service serviceImpl = new ServiceImpl();
        Method doService = serviceImpl.getClass().getMethod("doService");
        doService.invoke(serviceImpl);

    }
}
