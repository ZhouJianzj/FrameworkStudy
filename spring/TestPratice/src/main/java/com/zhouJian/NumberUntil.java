package com.zhouJian;

public class NumberUntil {
    public boolean isPrime(int num){
        for (int i = 2;i <Math.sqrt(num);i++){
            if(num  % i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean isDivisible(int num ){
        if(((num % 7 == 0) ||(num % 9 == 0)) && ((num % 5 != 0) && num % 2 != 0)){
            return true;
        }
        return false;
    }
}
