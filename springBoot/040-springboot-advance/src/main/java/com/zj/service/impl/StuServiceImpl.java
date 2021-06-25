package com.zj.service.impl;

import com.zj.service.StuService;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {
    @Override
    public String doFind() {
        return "一个学生";
    }
}
