package com.zj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test")
public class doDemo {
    /**
     *
     * 请求是 /test/some.do
     * @RequestMapping(value = "/test")写在类的上面可以标识请求前缀有一段相同的
     */
    @RequestMapping(value = {"/some.do","/other.do"})
    public ModelAndView doSome(){
        System.out.println("==============================");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doLoading","Loading........!");
//        当配置视图解析器的话就可以直接使用文件的名字来,如下：
        modelAndView.setViewName("showTwo");
        return modelAndView;
    }

    /**
     *
     *会执行 get请求，不是则会报错误
     */
    @RequestMapping(value = "/doOne.do",method = RequestMethod.GET)
    public ModelAndView doOne(){
        System.out.println("==============================");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doLoading","Loading........!");
//        当配置视图解析器的话就可以直接使用文件的名字来,如下：
        modelAndView.setViewName("showTwo");
        return modelAndView;
    }

    /**
     *
     * 会执行 post请求，不是则会报错误
     */
    @RequestMapping(value = "/doTwo.do",method = RequestMethod.POST)
    public ModelAndView doTwo(){
        System.out.println("==============================");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doLoading","Loading........!");
//        当配置视图解析器的话就可以直接使用文件的名字来,如下：
        modelAndView.setViewName("showTwo");
        return modelAndView;
    }

    /**
     *
     *默认的方法 会执行get 或者 post 请求
     */
    @RequestMapping(value = "/doEvery.do")
    public ModelAndView doEvery(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doLoading","Loading........!");
//        当配置视图解析器的话就可以直接使用文件的名字来,如下：
        modelAndView.setViewName("showTwo");
        return modelAndView;
    }
}
