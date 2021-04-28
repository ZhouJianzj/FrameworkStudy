package com.zj;

import com.zj.dao.Student;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/test")
public class doDemo {
    /**
     *
     * 请求是 /test/some.do
     * @RequestMapping(value = "/test")写在类的上面可以标识请求前缀有一段相同的
     *
     *
     */
    @RequestMapping(value = {"/some.do","/other.do"})
    public ModelAndView doSome(HttpServletRequest request){
//        获取用户请求传递过来的参数
        String name = request.getParameter("name");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("doLoading","Loading........!" + name);
//        当配置视图解析器的话就可以直接使用文件的名字来,如下：
        modelAndView.setViewName("showTwo");
        return modelAndView;
    }

    /**
     *   参数传递 要求：要和用户请求发来的参数name要一摸一样
     * @param name
     * @param age
     * @return
     * 具体的实现是通过Request.getParameter(),
     *      * 然后框架调用方法传递参数
     *      * 请求传递过来的参数都是String类型的字符串，所以当参数是int类型的时候会自动的调用Integer.ValueOf()
     *      * 注意：需要注意的是当用户传递过来的字符串是一个空字符串或者是浮点数的时候转换的时候会出现   400异常
     *      * 解决方法 方法参数不要使用int  使用Integer包装类型的,请求传递过来的参数需要是整数类型的
     */
    @RequestMapping(value = "/paramOne.do")
    public ModelAndView doParaOne(String name,Integer age){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName",name);
        modelAndView.addObject("userAge",age);
        modelAndView.setViewName("showOne");
        return modelAndView;
    }

    /**
     * 当参数名字和请求发送来的参数名字不一样的时候需要使用@RequestParam(value = "请求传递来的参数名字")
     * 有一个属性存在 Required 默认的是true表示的是请求中必须有此参数的值，没有的化就会报错
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/paramTwo.do")
    public ModelAndView paramTwo(@RequestParam(value = "UserName") String name,
                                 @RequestParam(value = "UserAge") Integer age){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName",name);
        modelAndView.addObject("userAge",age);
        modelAndView.setViewName("showOne");
        return modelAndView;
    }

    /**
     * 使用对象的为传递参数的时候，对象的属性需要和请求参数的参数名字一样
     * 框架会自动的创建对象，调用set方法赋值
     * @param student
     * @return
     */
    @RequestMapping(value = "/paramThree.do")
    public ModelAndView paramThree(Student student){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userName",student.getName());
        modelAndView.addObject("userAge",student.getAge());
        modelAndView.setViewName("showOne");
        return modelAndView;
    }
}
