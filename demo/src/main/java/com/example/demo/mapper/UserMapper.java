package com.example.demo.mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * @author zhoujian
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有的用户
     *
     * @return
     */
    List<User> selectAllUser();

    /**
     *插入新的对象的时候返回id
     */
    @Insert(value = "insert into user(id, name, age) VALUES (#{id},#{name},#{age})")
    @Options(useGeneratedKeys = true,
            keyColumn = "id",
            keyProperty = "id")
    @SelectKey(statement = "select last_insert_id()",
            keyColumn = "id" ,
            keyProperty = "id",
            before = false,
            resultType = Integer.class)
    Integer insertUser(User user);
}
