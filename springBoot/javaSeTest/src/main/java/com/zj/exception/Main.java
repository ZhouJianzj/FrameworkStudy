package com.zj.exception;

import java.util.Scanner;

public class Main {
    public void dodo() throws ExceptionFather{
        System.out.println("请输入0-10之间的数字");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1){
            throw  new ExceptionSonOne("i == 1 Exception!");
        }else if (i == 2){
            throw new ExceptionSonTwo("i == 2 Exception!");
        }else {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        try {
            new Main().dodo();
        } catch (ExceptionFather e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("program Execute End !");
        }
    }
}
