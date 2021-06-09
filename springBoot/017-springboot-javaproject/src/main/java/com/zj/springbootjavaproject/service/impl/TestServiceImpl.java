package com.zj.springbootjavaproject.service.impl;

import com.zj.springbootjavaproject.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String sayHell() {
        return "Say Hello";
    }
}
