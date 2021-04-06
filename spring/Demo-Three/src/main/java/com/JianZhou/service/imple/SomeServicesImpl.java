package com.JianZhou.service.imple;

import com.JianZhou.service.SomeServices;

public class SomeServicesImpl implements SomeServices {
    @Override
    public void doOther() {
        System.out.println("doOther 方法执行了");
    }

    @Override
    public void doSome() {
        System.out.println("doSome 方法执行了");
    }
}
