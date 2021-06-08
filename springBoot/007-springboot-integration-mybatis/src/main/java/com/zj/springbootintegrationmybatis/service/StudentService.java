package com.zj.springbootintegrationmybatis.service;

import com.zj.springbootintegrationmybatis.model.Student;


public interface StudentService {
    Student selectStu(Integer id);
}
