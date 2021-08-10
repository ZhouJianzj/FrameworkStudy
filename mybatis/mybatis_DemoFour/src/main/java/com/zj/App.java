package com.zj;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zj.dao.DemoDao;
import com.zj.model.Demo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        InputStream mybatisConfig = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(mybatisConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DemoDao mapper = sqlSession.getMapper(DemoDao.class);
//        书写分页代码
        Page<Object> objects = PageHelper.startPage(1, 2);
        List<Demo> list = mapper.selectBook();
        for (Demo demo:list){
            System.out.println(demo);
        }
        sqlSession.close();
    }
}
