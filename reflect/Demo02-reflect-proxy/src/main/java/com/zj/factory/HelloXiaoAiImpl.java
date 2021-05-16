package com.zj.factory;

import com.zj.service.Hello;

/**
 * @author zhoujian
 * 工厂类，实现service中的接口的
 */
public class HelloXiaoAiImpl implements Hello {

    @Override
    public String sayHello(String name) {
       return  "你好：" + name;
    }
}
