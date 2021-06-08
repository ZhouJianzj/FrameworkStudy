package com.zj.springbootintegrationmybatis.service.imple;

import com.zj.springbootintegrationmybatis.mapper.StudentMapper;
import com.zj.springbootintegrationmybatis.model.Student;
import com.zj.springbootintegrationmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student selectStu(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
