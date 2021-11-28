package com.zj;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zj.dao.Student;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = "/test")
public class doDemo {

    /**
     * 返回值是String类型的时候，表示的是返回的view逻辑地址实现页面跳转的，
     * 可以传递参数，自己添加变量就ok了
     */
    @RequestMapping(value = "StringReturn.do")
    public String paramThree(HttpServletRequest request, Student student) {
        request.setAttribute("name", student.getName());
        request.setAttribute("age", student.getAge());
        //前提是添加了视图解析器
        return "showOne";
    }

    /**
     * 返回值是void 的时候一般处理的局部刷新操作
     *
     * @param name
     * @param age
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "returnVoidAjax.do", method = RequestMethod.POST)
    public void doAjax(String name,
                       Integer age,
                       HttpServletResponse response) throws IOException {
        //接受ajax传递过来的参数装成对象
        Student student = new Student(name, age);
        //使用jackson转换成json数据类型
        ObjectMapper objectMapper = new ObjectMapper();
        String studentJson = objectMapper.writeValueAsString(student);
        //发送响应到页面
        response.setContentType("javaScript/json");
        PrintWriter writer = response.getWriter();
        writer.write(studentJson);
        writer.flush();
        writer.close();
    }

    /**
     * 返回是Object对象，上面的返回值是void是实现ajax异步请求的，下面的是使用注解的方法去实现的，返回值是Object
     * 简化了上面的 writeValueAsString 和  Response.getWriter.write()操作了
     */
    @RequestMapping("ReturnObject.do")
    @ResponseBody
    public Student doReturn(String name, Integer age) {
        return new Student(name, age);
    }

    /**
     * 返回值是Object对象之List集合,能保持添加的顺序
     * 具体的是测试是 按钮测试ajax请求，和 超链接（改一下请求方式为get）
     */
    @RequestMapping(value = "doReturnListAsJson.do", method = RequestMethod.POST)
    @ResponseBody
    public List<Student> doReturnListAsJson() {
        List<Student> students = new ArrayList<>();
        Student student = new Student("小明", 22);
        students.add(student);
        student = new Student("小张", 21);
        students.add(student);
        return students;
    }

    /**
     * 返回值是String类型的时候当有responseBody的时候返回的是数据不是视图view
     *
     * @return string类型的字符：produces ="java/plain;charset=utf-8"指定浏览器响应的字符集contentType
     */
    @RequestMapping(value = "doReturnString.do", produces = "java/plain;charset=utf-8")
    @ResponseBody
    public String doReturnString() {
        return "你好！";
    }
}

