package com.zj.web;

/**
 * @author zhoujian
 */
@org.springframework.stereotype.Controller
public class ControllerT {
    public  void mainTest() {

        int n = 0 -1;

            n |= n >>> 1;
            n |= n >>> 2;
            n |= n >>> 4;
            n |= n >>> 8;
            n |= n >>> 16;
        System.out.println(n + 1 );


        System.out.println("------------------------------------------------------------------------------------------------");
        //等同于除法运算
        int a = 5;
        System.out.println(a >>> 1);
        //等同于乘法运算
        int b = 2;
        System.out.println(b << 1);
    }
}
