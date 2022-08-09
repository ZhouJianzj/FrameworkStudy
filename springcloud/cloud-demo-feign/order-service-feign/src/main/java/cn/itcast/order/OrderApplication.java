package cn.itcast.order;


import cn.itcast.clients.UserClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("cn.itcast.order.mapper")
@SpringBootApplication

//两种方式导入需要使用的feign客户端模板
//@EnableFeignClients(basePackages = "cn.itcast.feign.clients")
@EnableFeignClients(clients = {UserClient.class})
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}