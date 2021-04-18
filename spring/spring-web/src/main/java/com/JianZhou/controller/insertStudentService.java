package com.JianZhou.controller;

import com.JianZhou.entities.Student;
import com.JianZhou.service.StudentService;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class insertStudentService extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        System.out.println("===============================================");
        //方法一：
//         String config = "springConfig.xml";
//        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//        StudentService bean = (StudentService) ac.getBean("studentServiceImpl");
//        int i = bean.doStudentInsert(new Student());
//        System.out.println(i);

//        使用监听器创建容器
        WebApplicationContext wac = null;
        //方法二：
//        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
//        Object attribute = getServletContext().getAttribute(key);
//        if (attribute !=null){
//            //这个就是容器对象
//            wac = (WebApplicationContext)attribute;
//        }
        //方法三：推荐使用 框架提供的方法
        ServletContext sc= getServletContext();
        wac = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
        StudentService studentService = (StudentService) wac.getBean("studentService");
        int i = studentService.doStudentInsert(new Student(Integer.parseInt(id), name, Integer.parseInt(age)));
        System.out.println(i);

        resp.sendRedirect("result.jsp");
    }
}
