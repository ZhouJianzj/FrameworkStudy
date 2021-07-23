package com.jianZhou.service.imple;

import com.jianZhou.service.SomeServices;
import org.springframework.stereotype.Component;

@Component(value = "services")
public class SomeServiceImple  implements SomeServices {
    @Override
    public void doOther() {
        System.out.println("doOther()方法执行了 ");
    }

    @Override
    public String  doSome() {
        System.out.println("doSome方法执行了");
        return "aaa";
    }

    @Override
    public void doJoinPoint(String string,Integer integer) {
        System.out.println("doJoinPoint方法执行！");
    }

    @Override
    public void doAround() {
        System.out.println("环绕通知的目标对象方法！");

    }

    @Override
    public void doException() {
         int a = 10/0;
    }

    @Override
    public void doPoinCut() {
        System.out.println("doPoinCut()执行了");
    }

    @Override
    public void doAfter() {
        System.out.println("doAfter执行了");
    }
}
