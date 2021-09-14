package com.zj.dubbospringbootprovider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zj.service.ServiceGet;
import org.springframework.stereotype.Component;

/**
 * @author zhoujian
 */
@Component
@Service(interfaceClass = ServiceGet.class,version = "1.0.0" ,timeout = 1500)
public class ServiceGetImpl implements ServiceGet {

    @Override
    public Integer doGet() {
        return 520;
    }
}
