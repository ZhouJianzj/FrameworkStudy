package com.zhoujian.dao.imple;

import com.zhoujian.dao.StudentDao;
import com.zhoujian.entity.Student;
import com.zhoujian.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImple  implements StudentDao {
    @Override
    public List<Student> selectMethod() {
        //自己的工具类获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String sqlId = "com.zhoujian.dao.StudentDao.selectMethod";
        //得到查询的结果
        List<Student> list = sqlSession.selectList(sqlId);
        //关闭
        sqlSession.close();
        return list;
    }


    public static void main(String[] args) {
        StudentDaoImple studentDaoImple = new StudentDaoImple();
        List<Student> studentList = studentDaoImple.selectMethod();
        studentList.forEach(student -> System.out.println(student));

    }
}
