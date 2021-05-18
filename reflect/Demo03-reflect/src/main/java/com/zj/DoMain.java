package com.zj;

import com.zj.factory.ServiceInterfaceImpl;

import com.zj.handle.ProxyName;
import com.zj.service.ServiceInterface;


import java.lang.reflect.Proxy;

public class DoMain {
    public static void main(String[] args) {
        ServiceInterface serviceInterface = new ServiceInterfaceImpl();
        ProxyName proxyName = new ProxyName(serviceInterface);

        ServiceInterface o = (ServiceInterface) Proxy.newProxyInstance(serviceInterface.getClass().getClassLoader(),
                serviceInterface.getClass().getInterfaces(),
                proxyName);
        System.out.println(serviceInterface.doSome("周健"));
    }
}
