package com.zj.test;

import com.zj.service.TestService;

public class Test {

    private TestService testService;

    public String testOne(){
        return testService.sayHello();
    }
}
