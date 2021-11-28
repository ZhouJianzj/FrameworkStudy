package com.zj.method;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Stream {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("zhoujian");
        strings.add("zhoujian");
        strings.add("zhou");
        strings.add("jian");
        strings.add("zj");
        strings.add("z");
        strings.add("j");
//         没有使用函数式的编程
        strings.stream()
                .distinct()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.contains("z");
                    }
                }).forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });

        System.out.println("----------------------------------------");
//        使用函数式的编程,最后需要使用终结方法来结束操作不然没有结果
        strings.stream().filter(string -> string.contains("z")).distinct()
                .forEach(string -> System.out.println(string));
//                .forEach(System.out::println);

    }
}


