package com.example.mybatis_demo_foreach;

import com.example.mybatis_demo_foreach.dao.Dao;
import com.example.mybatis_demo_foreach.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoujian
 */
@MapperScan("com.example.mybatis_demo_foreach.dao")
@SpringBootApplication
public class MybatisDemoForeachApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDemoForeachApplication.class, args);

    }

}
