package com.Jianzhou.dao;

import com.Jianzhou.entities.Sale;
import org.apache.ibatis.annotations.Insert;

public interface SaleDao {
    /**
     * 卖出去的产品
     */
@Insert("insert into sale(gid,salenum) values(#{gId},#{saleNum})")
    int  doInsert(Sale sale);
}
