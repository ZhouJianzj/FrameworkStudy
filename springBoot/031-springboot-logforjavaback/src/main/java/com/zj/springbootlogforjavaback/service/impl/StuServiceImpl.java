package com.zj.springbootlogforjavaback.service.impl;

import com.zj.springbootlogforjavaback.mapper.StudentMapper;
import com.zj.springbootlogforjavaback.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StuServiceImpl implements StuService {
    @Resource
    private StudentMapper studentMapper;

    @Override

    public Integer findStu() {
        return studentMapper.selectStudents();
    }
}
