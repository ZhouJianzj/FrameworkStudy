package com.zj.object;

public class Enums {
    public static void main(String[] args) {
        int a = 5;
        if (a == 5) {
            Result c = Result.success;
            System.out.println(c);
        } else if (a == 4) {
            Result fail = Result.fail;
        } else {
            Result none = Result.none;

        }
    }
}

enum Result {
    success,
    fail,
    none

}

