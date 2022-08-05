package cn.itcast.order.web;


import cn.itcast.order.pojo.Order;
import cn.itcast.order.service.OrderService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

   @Autowired
   private OrderService orderService;

    /**
     * 热点限流
     * @param orderId
     * @return
     */
    @SentinelResource("hot")
    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
        return orderService.queryOrderById(orderId);
    }


    /**
     * 演示限流的关联模式
     * @return
     */
    @GetMapping("update")
    public String orderUpdate(){
        return "订单更新"   ;
    }

    @GetMapping("query")
    public String orderQuery(){
        return "订单查询"   ;
    }


    /**
     * 演示限流的链路模式
     */

    @GetMapping("queryOrder")
    public String queryOrder(){
        orderService.queryUserInfo();
        return "订单查询需要查询用户信息"   ;
    }
    @GetMapping("queryUser")
    public String queryUser(){
        orderService.queryUserInfo();
        return "用户查询需要查询用户信息"   ;
    }
}
