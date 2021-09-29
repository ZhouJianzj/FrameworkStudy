package com.zj.springbootinline.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
/**
 * 内联一共可以是三个text javascript null
 */
public class Controller {
    /**
     * 内联文本
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "inlineText")
    public String inlineText(Model model) {
        model.addAttribute("data", "周健");
        return "Text";
    }

    /**
     * 内联脚本
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/inlineJs")
    public String inlineJavascript(Model model) {
        model.addAttribute("data", "周健");
        return "Javascript";
    }
}
