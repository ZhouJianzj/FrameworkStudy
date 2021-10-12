package com.zj.demo009feignfactoryconsumer.hystrix;



import com.zj.demo009feignfactoryconsumer.server.Service;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 可以获取异常信息
 */
@Component
public class MyHystrix  implements FallbackFactory<Service> {
    /**
     * 重写里面的方法
     * @param throwable
     * @return
     */
    @Override
    public Service create(Throwable throwable) {
        return new Service() {
            @Override
            public String serviceTest() {
                return throwable.getMessage();
            }
        };
    }
}
