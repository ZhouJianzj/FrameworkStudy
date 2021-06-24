package com.zj.service;

import com.zj.entity.Student;

/**
 * @author zhoujian
 */
public interface StudentService {
    /**
     * @return 返回查詢到的學生
     */
    Student findStu(Integer id);
}
