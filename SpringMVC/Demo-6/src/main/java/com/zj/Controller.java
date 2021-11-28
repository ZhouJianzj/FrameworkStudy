package com.zj;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhoujian
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/dodo")
    public String dodo() {
        return "T";
    }
}
