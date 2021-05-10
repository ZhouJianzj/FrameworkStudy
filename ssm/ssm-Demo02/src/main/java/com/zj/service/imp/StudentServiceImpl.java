package com.zj.service.imp;

import com.zj.dao.StudentDao;
import com.zj.doMain.Student;
import com.zj.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    /**
     * 这里为什么可以使用自动注入，是因为spring配置文件中配置了Mapping扫描器生成了Dao接口的实现类
     */
    @Resource
    private StudentDao studentDao;
    @Override
    public List<Student> findStudents() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }

    @Override
    public int addStudent(Student student) {
        int i = studentDao.insertStudent(student);
        return i;
    }
}
