package com.zj.dao;

import com.zj.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    List<Dept> daoSelectDept();
}
