package com.jianZhou;


import com.jianZhou.dao.StudentDao;
import com.jianZhou.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName testApp
 * @Description TODO
 * @Author zhouJian
 * @Date 2021/3/21
 **/
public class testApp {
    public static void main(String[] args) {
        String config = "mybatis.xml";
        try {
            //获取mybatis配置文件
            InputStream in = Resources.getResourceAsStream(config);
            //创建建造工厂的会话层对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            //建设对象去建设之前获取的mybatis配置文件
            SqlSessionFactory factory = builder.build(in);
            //工厂打开会话讨论生产什么
            SqlSession sqlSession = factory.openSession();
            //需要的材料，也就是之前写好的xml文件，需要以namespace形式加点加id
            String sqlId = "com.jianZhou.dao.StudentDao" +"." + "selectMethod";
            //材料有了就开始生产了,得出结果
            List<Student> students = sqlSession.selectList(sqlId);
            //循环遍历
            students.forEach(stu -> System.out.println(stu));

            System.out.println("=================");
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            System.out.println(mapper.select(1).toString());
            //最后关闭机器
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
