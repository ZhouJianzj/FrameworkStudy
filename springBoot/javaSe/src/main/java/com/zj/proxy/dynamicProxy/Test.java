package com.zj.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 程序入口
 */
public class Test {
    public static void main(String[] args) {
        JayImp jayImp = new JayImp();
        ISing subjectProxy = (ISing) Proxy.newProxyInstance(
                jayImp.getClass().getClassLoader(),
                jayImp.getClass().getInterfaces(),
                new JayAgentFactory(jayImp));
        subjectProxy.sing();
    }
}

/**
 * 业务接口
 */
interface ISing {
    void sing();
}

/**
 * 周杰伦
 */
class JayImp implements ISing {
    @Override
    public void sing() {
        System.out.println("say happy birthday to you girl friend");
    }
}


/**
 * 代理工厂
 */
class JayAgentFactory implements InvocationHandler {
    Object target;

    public JayAgentFactory(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(target, args);
        logAfter(invoke);
        return invoke;
    }

    public void logAfter(Object invoke) {
        System.out.println("结果 " + invoke);
        System.out.println("收入 ++ ");
    }
}