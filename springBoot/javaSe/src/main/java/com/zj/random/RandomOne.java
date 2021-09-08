package com.zj.random;

import java.util.Random;

/**
 * @author zhoujian
 */
public class RandomOne {
    public static void main(String[] args) {

        Random random = new Random();
//        System.out.println(random.nextBoolean());
//        0~1之间的
        System.out.println(random.nextInt(2));
    }
}
