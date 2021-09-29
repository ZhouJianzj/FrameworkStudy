package com.zj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * @author zhoujian
 */
public class GetClassAnnotation {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student> studentClass = Student.class;
        //student类上是否有注解
        System.out.println(studentClass.isAnnotation());
        //student类上是否有an这个注解
        System.out.println(studentClass.isAnnotationPresent(an.class));
        //获取类中的属性
        Field name = studentClass.getDeclaredField("name");
        //属性上面是否有an这个注解
        System.out.println(name.isAnnotationPresent(an.class));
        //获取属性上的注解，并且获取到注解中的属性值
        System.out.println(name.getAnnotation(an.class).name());

    }
}

class Student {
    /**
     * 可以赋值，也可以不赋值，因为有默认值
     */
    @an
    String name;
}

/**
 * @author zhoujian
 */
//定义注解只能使用在属性上面
@Target({ElementType.FIELD})
//定义属性，保存在class中并且可以被反射
@Retention(RetentionPolicy.RUNTIME)
@interface an {
    //    注解赋默认值
    String name() default "zhoujian";

}
