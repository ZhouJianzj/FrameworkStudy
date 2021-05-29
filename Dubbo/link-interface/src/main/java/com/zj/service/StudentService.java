package com.zj.service;

import com.zj.model.Student;

public interface StudentService {
    /**
     * @return 根据id查询学生
     */
    Student findStu(Integer id);

    /**
     * @return  查询学生的数量
     */
    Integer findStuNum();
}
