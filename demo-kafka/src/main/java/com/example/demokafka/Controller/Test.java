package com.example.demokafka.Controller;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        doDo();
        System.out.println("父方法");
        System.out.println();

    }

    public static void doDo(){
        System.out.println("子方法");
    }
}
