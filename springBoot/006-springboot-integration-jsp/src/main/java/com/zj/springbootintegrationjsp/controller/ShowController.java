package com.zj.springbootintegrationjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhoujian
 */
@Controller
public class ShowController {
    @RequestMapping(value = "/show")
    public String show() {
        return "show";
    }
}
