package com.jianZhou.service.imple;

import com.jianZhou.service.SomeServices;
import org.springframework.stereotype.Component;

@Component(value = "services")
public class SomeServiceImple  implements SomeServices {
    @Override
    public void doOther() {
        System.out.println("====================");
    }

    @Override
    public String  doSome() {
        System.out.println("====================");
        return "aa";
    }

    @Override
    public void doJoinPoint(String string,Integer integer) {
        System.out.println("doJoinPoint方法执行！");
    }

    @Override
    public String doAround() {
        System.out.println("环绕通知的目标对象方法！");
        return "@Around";
    }
}
