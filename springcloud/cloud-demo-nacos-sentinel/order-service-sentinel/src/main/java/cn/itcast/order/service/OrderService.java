package cn.itcast.order.service;

import cn.itcast.clients.UserClient;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import cn.itcast.pojo.User;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserClient userClient;


    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        User user = userClient.getUserById(order.getUserId());
        order.setUser(user);
//         4.返回
        return order;
    }

    /**
     * 模拟链路模式
     * 用户信息查询
     */
    @SentinelResource("users")
    public void queryUserInfo() {
        System.out.println("用户信息！");
    }
}
