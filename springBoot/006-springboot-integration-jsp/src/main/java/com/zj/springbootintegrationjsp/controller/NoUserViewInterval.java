package com.zj.springbootintegrationjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhoujian
 */
@Controller
public class NoUserViewInterval {
    @RequestMapping(value = "/noUse")
    public String noUse() {

        return "forward:/noUse.jsp";
    }
}
