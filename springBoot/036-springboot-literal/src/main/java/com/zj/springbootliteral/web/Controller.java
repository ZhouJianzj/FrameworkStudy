package com.zj.springbootliteral.web;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhoujian
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "literal")
    public String testLiteral() {
        return "Literal";
    }
}
