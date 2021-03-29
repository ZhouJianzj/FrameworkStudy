package com.jianZhou;

import com.jianZhou.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName testTwo
 * @Description TODO
 * @Author
 * @Date 2021/3/21
 **/
public class testTwo {
    public static void main(String[] args) {
        String config = "mybatis.xml";
        try {
            InputStream in = Resources.getResourceAsStream(config);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            SqlSession sqlSession = factory.openSession();
            String sqlId = "com.jianZhou.dao.StudentDao.insertMethod";
            int i = sqlSession.insert(sqlId, new Student(10004, "王家", "1232@qq.com"));
            //这里是需要提交事务的
            sqlSession.commit();
            //记得需要关闭
            sqlSession.close();
            System.out.println("插入的数据为：" + i + "条");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
