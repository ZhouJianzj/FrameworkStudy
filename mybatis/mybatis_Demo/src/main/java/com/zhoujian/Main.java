package com.zhoujian;

import com.zhoujian.dao.StudentDao;
import com.zhoujian.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoujian
 */
public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        sqlSession.selectOne("com.zhoujian.dao.StudentDao.selectMethod");
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);
        ArrayList list = (ArrayList) mapper.selectMethod();
        System.out.println(list);
    }
}
