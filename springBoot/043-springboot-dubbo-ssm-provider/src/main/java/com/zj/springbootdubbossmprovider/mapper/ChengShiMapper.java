package com.zj.springbootdubbossmprovider.mapper;

import com.zj.springbootdubbossmprovider.model.ChengShi;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChengShiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChengShi record);

    int insertSelective(ChengShi record);

    ChengShi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChengShi record);

    int updateByPrimaryKey(ChengShi record);
}