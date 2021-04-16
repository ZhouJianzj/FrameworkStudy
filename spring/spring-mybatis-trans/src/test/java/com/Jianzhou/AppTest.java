package com.Jianzhou;

import static org.junit.Assert.assertTrue;

import com.Jianzhou.service.buyGoods;
import com.Jianzhou.service.impl.buyGoodsImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  @Test
    public void testBuy(){
      String config ="spring-mybatis.xml";
      ApplicationContext ac = new ClassPathXmlApplicationContext(config);
      buyGoods buyGoodsImpl = (buyGoods) ac.getBean("buyGoodsImpl");
      int buy = buyGoodsImpl.buy(1002, 10);
      if (buy == 1){
          System.out.println("购买成功！");
      }
  }
}
