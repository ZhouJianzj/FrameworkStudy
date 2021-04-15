package com.Jianzhou.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GoodDao {
    /**
     * 查询
     */
    @Select("select num from goods where id =#{id}")
    int doSelect(Integer id);

    /**
     * 更新
     */
    @Update("update goods set num = #{saleNum} where id = #{gId}")
    int doUpdate(@Param("gId") Integer gId ,@Param("saleNum")Integer saleNum);
}
