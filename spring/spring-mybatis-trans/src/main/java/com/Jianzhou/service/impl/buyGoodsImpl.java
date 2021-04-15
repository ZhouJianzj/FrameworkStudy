package com.Jianzhou.service.impl;

import com.Jianzhou.dao.GoodDao;
import com.Jianzhou.dao.SaleDao;
import com.Jianzhou.entities.Sale;
import com.Jianzhou.exception.myException;
import com.Jianzhou.service.buyGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional(
//        注意 ：  为什么要加事务，是为了sale表中的插入的数据都是真是存在的，当goodDao类中的方法没有执行成功的时候，sale表中就不会插入数据
//        事务的行为
        propagation = Propagation.REQUIRED,
//        事务的隔离级别
        isolation = Isolation.DEFAULT,
//        时候可读
        readOnly = false,
//        回滚的异常类型，是一个class类型的数组
        rollbackFor = {
                myException.class
        }
)
public class buyGoodsImpl implements buyGoods {
    @Autowired
    private SaleDao saleDao ;
    @Autowired
    private GoodDao goodDao;
    @Override
    public int buy(Integer gId, Integer sNum) {
        Sale sale = new Sale(gId,sNum);
        saleDao.doInsert(sale);
        int haveNum = goodDao.doSelect(gId);
        //自定义的异常的
        if (haveNum == 0){
            throw new myException("该编号为" + gId + "的商品没有库存了！");
        }else if (haveNum < sNum){
            throw new myException("该编号为" + gId + "的商品库存不足！");
        }

        int i = goodDao.doUpdate(gId,(haveNum - sNum));
        System.out.println(
                "卖出商品编号 ：" + gId + "   " + "数量：" + sNum + "\n"+
                "库存：" + goodDao.doSelect(gId)
        );
        return i;
    }
}
