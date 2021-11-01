package com.zj.method;

import java.util.function.Function;

/**
 * @author zhoujian
 *
 * Function接口中的方法使用
 */
public class MyFunction {
    public static void main(String[] args) {
//      apply方法 首先书写号apply方法的函数的怎么执行
        Function<Integer, Integer> function = res->res +1;
        //3
        System.out.println(function.apply(2));



//       compose方法,意思就是组合的意识，先执行compose里面组合的方法function然后执行function1的方法
        Function<Integer, Integer> function1 = res -> res * 10;
        //2 + 1 = 3 * 10 = 30
        System.out.println(function1.compose(function).apply(2));




//       andThen方法和compose方法执行的顺寻完全是相反的，先执行function1方法然后执行function方法
        // 2 * 10  + 1 = 21
        System.out.println(function1.andThen(function).apply(2));

//      传入什么参数就输出什么参数
        System.out.println(Function.identity().apply(1));
    }
}
