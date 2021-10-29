package com.example.demo1user.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import zj.entity.Log;

@Mapper
public interface LogDao {

    @Insert("insert into log(username, url, module, starttime,oper) values(#{username},#{url},#{module},#{starttime},#{oper})")
    void logInsert(Log log);
}
