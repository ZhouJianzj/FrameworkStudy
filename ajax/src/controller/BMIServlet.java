package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BMIServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String h = request.getParameter("h");
        String w = request.getParameter("w");
        float H = Float.valueOf(h);
        float W = Float.valueOf(w);
        float bmi = W / (H * H);
        String msg ="";
        if (bmi <= 18.5){
            msg = "你的身体比较瘦";
        }else if(bmi > 18.5 && bmi <= 23.9){
            msg = "你的bmi正常";
        }else if (bmi > 24 && bmi <= 27){
            msg = "你的身体比较胖";
        }else{
            msg = "你的身体肥胖";
        }
        System.out.println("BMI==========>" + msg);
        request.setAttribute("Bmi",msg);
        request.getRequestDispatcher("Bmi.jsp").forward(request,response);
    }
}
