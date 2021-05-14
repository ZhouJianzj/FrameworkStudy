package com.zj.service;

import com.zj.dao.StudentDao;
import com.zj.entities.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhoujian
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public Student findStudent(int id) {
        Student student = null;
        List<Student> students = studentDao.selectStudent(id);
        Iterator<Student> iterator = students.iterator();
        if(students.isEmpty()){
            student = new Student();
            student.setName("无数据");
            student.setAge(0);
        }else {
            while(iterator.hasNext()){
                student = iterator.next();
            }
        }
        return student;
    }
}
