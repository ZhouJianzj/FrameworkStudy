package com.zhouJian;

public class Triangle {
    public void isNoTriangle(int a,int b, int c){
        if (a + b <= c || a + c <= b || c + b <= a){
            System.out.println("不能构成三角形");
        }else{
            if (a == b || a == c || b == c){
                if (a == b && a == c){
                    System.out.println("等边三角形");
                }else{
                    System.out.println("等腰三角形");
                }
            }else {
                System.out.println("一般三角形");

            }
        }
    }
}
