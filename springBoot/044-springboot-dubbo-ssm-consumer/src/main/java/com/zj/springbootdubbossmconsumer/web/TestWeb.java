package com.zj.springbootdubbossmconsumer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestWeb {
    /**
     * @return 测试web集成jsp时候成功，成功！
     */
    @RequestMapping("/showPage")
    public ModelAndView testPage() {
        return new ModelAndView("show");

    }

}
