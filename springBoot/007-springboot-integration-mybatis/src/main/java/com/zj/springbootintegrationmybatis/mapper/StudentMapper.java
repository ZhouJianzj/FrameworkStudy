package com.zj.springbootintegrationmybatis.mapper;

import com.zj.springbootintegrationmybatis.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
    /**
     * 根据主键删除一条记录
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入一个记录
     *
     * @param record
     * @return
     */
    int insert(Student record);

    /**
     * 插入一个记录，只插入有值的属性
     *
     * @param record
     * @return
     */
    int insertSelective(Student record);

    @Select(value = "select * from student where id = #{id}")
    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);


    void insertStudent();
}