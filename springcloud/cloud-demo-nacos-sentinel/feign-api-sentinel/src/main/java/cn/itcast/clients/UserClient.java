package cn.itcast.clients;


import cn.itcast.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 声明事服务,fallbackFactory需要被注册为bean
 */
@FeignClient(value = "userServer" ,fallbackFactory = UserClientFallbackFactory.class)
public interface UserClient {

    /**
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable("id") Long id);
}
