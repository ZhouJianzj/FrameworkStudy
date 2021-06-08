package com.zj.springbootmybatismapperscan.service;

import com.zj.springbootmybatismapperscan.mapper.StudentMapper;
import com.zj.springbootmybatismapperscan.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectStu(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
