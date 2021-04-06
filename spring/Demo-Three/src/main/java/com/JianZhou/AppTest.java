package com.JianZhou;

import com.JianZhou.service.SomeServices;
import com.JianZhou.service.imple.SomeServicesImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class AppTest {
    public static void main(String[] args) {
        //之前的对象
        SomeServices servicesImpl = new SomeServicesImpl();
        //实现Invocation接口的对象
        InvocationHandler test = new Test(servicesImpl);
        //创建代理，一个是类加载器，一个是对象的所实现的接口，最后是实现Invocation接口的对象就是在里面添加方法的类
        SomeServices o = (SomeServices) Proxy.newProxyInstance(servicesImpl.getClass().getClassLoader(),
                servicesImpl.getClass().getInterfaces(), test);
        //得到的结果是添加的所有方法加上doOther方法，而不是一个类的正常的执行
        o.doOther();
        System.out.println("++++++++++++++++++++++++");
        o.doSome();
    }

}
/**
 *
 现在 需要对接口实现类添加方法，在不修改代码的前提下
 */
class Test implements InvocationHandler{
    private Object target ;

    public Test() {
    }

    public Test(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = null;
        //之前对象方法前所需要的添加的方法
        System.out.println("doOther方法之前执行的方法");
        invoke = method.invoke(target, args);
        if ("doSome".equals(method.getName())){
            System.out.println("====================");
        }
        //之前对象方法之后所需要添加的方法
        System.out.println("doSome方法之后执行的方法");
        return invoke;
    }
}
