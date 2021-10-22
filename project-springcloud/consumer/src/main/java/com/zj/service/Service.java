package com.zj.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "gateway")
public interface Service {
    @RequestMapping("dept")
    List ctlSelectDept();
}
