package com.example.demo.mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

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
}
