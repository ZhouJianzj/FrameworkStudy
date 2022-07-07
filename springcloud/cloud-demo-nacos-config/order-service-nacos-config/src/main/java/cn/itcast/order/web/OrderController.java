package cn.itcast.order.web;

import cn.itcast.order.config.ConfigProperties;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("order")
/*方法一：热加载nacos配置中心中的配置的*/
@RefreshScope
public class OrderController {

   @Autowired
   private OrderService orderService;

    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
        return orderService.queryOrderById(orderId);
    }

    @Value("${pattern.dateformat}")
    private String dataFormat;


    /**
     *
     * 从nacos配置中心中获取配置属性
     * @return
     */
    @GetMapping("now")
    public String getNow(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dataFormat));

    }

    @Autowired
    private ConfigProperties configProperties;
    /**
     *
     */
    @GetMapping("nowTwo")
    public String getNowTwo(){
        return configProperties.getDateformat();

    }
}
