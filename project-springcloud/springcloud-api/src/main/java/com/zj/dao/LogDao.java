package com.zj.dao;

import com.zj.entities.Log;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogDao {

    @Insert("insert into log(username, url, module, starttime,oper) values(#{username},#{url},#{module},#{starttime},#{oper})")
    void logInsert(Log log);
}
