package com.zj.handle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyName implements InvocationHandler {
    private Object o;

    public ProxyName(Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(o, args);
        return "===";

    }
}
