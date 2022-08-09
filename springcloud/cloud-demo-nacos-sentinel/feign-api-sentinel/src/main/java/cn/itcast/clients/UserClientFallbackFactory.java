package cn.itcast.clients;

import cn.itcast.pojo.User;
import feign.hystrix.FallbackFactory;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

/**
 * @author zhoujian
 */

public class UserClientFallbackFactory implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable throwable) {

        return  new UserClient() {
            @Override
            public User getUserById(Long id) {
//                log.error("查询用户信息异常",throwable);
                System.out.println("发生熔断");
                return new User();
            }
        };
    }
}
