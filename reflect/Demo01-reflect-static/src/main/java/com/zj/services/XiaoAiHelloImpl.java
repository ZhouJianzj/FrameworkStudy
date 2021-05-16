package com.zj.services;

public class XiaoAiHelloImpl implements Hello {
    @Override
    public void sayHello(String name) {
        System.out.println("你好：" + name);
    }
}
