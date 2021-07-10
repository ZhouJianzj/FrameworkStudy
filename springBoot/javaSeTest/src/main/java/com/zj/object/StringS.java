package com.zj.object;

import com.zj.array.ArrayOne;

/**
 * @author zhoujian
 */
public class StringS {
    public static void main(String[] args) {
        String i = new String("zhoujian");
        String a = new String("zhoujian");
        System.out.println(a.equals(i));
        String split = "zhou@jian@nnan@jajj@addd";
        System.out.println(split.charAt(1));
//        左闭右开
        Integer in = 1;
        System.out.println(split.substring(0, 1));
        String s = String.valueOf(new ArrayOne());
//        char[] chars = split.toCharArray();
//        for (int j = 0; j < chars.length; j++) {
//            System.out.println(chars[j]);
//        }
//        String replace = split.replace("@", ".");
//        System.out.println(replace);
//
//        String[] s = replace.split("\\.");
//        for (int j = 0; j < s.length; j++) {
//            System.out.println(s[j]);
//        }
    }
}
