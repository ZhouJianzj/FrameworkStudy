package com.zj.springbootmybatisresourcemapper.service.imple;

import com.zj.springbootmybatisresourcemapper.mapper.StudentMapper;
import com.zj.springbootmybatisresourcemapper.model.Student;
import com.zj.springbootmybatisresourcemapper.service.StuService;
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
