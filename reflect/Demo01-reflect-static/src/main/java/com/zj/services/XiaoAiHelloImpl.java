package com.zj.services;

/**
 * @author zhoujian
 */
public class XiaoAiHelloImpl implements Hello {
    @Override
    public void sayHello(String name) {
        System.out.println("你好：" + name);
    }
}
