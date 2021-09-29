package com.zj.reflect;

import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldOne {
    public static void main(String[] args) throws FileNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<Stu> stuClass = Stu.class;
        //使用getFields方法只能获取到public修饰的成员变量
        Field[] fields = stuClass.getFields();
        System.out.println(fields.length);
        //使用getDeclaredFields方法可以获取到所有的成员变量
        Field[] declaredFields = stuClass.getDeclaredFields();
        System.out.println(declaredFields.length);
        //获取所有成员变量的名字
        for (Field f : declaredFields) {
            System.out.print(f.getName() + " ");
        }
        //获取成员变量的类型
        System.out.println();
        for (Field f : declaredFields) {
            System.out.print(f.getType() + "____");
        }
        //获取成员变量的修饰符
        System.out.println();
        for (Field f : declaredFields) {
            System.out.print(f.getModifiers() + "==" + Modifier.toString(f.getModifiers()) + " ");
        }

//       根据class文件获取java文件
        System.out.println();
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(Modifier.toString(stuClass.getModifiers()) + " " + "class" + " " + stuClass.getSimpleName() + "{" + "\n");
        for (Field f : declaredFields) {
            stringBuffer.append(Modifier.toString(f.getModifiers()) + " ");
            stringBuffer.append(f.getType().getSimpleName() + " ");
            stringBuffer.append(f.getName() + " " + ";" + "\n");
        }
        stringBuffer.append("}");
//        FileOutputStream fileOutputStream = new FileOutputStream("D:/log.java");
//        System.setOut(new PrintStream(fileOutputStream));
        System.out.println(stringBuffer);


//        给对象的属性赋值和得到值
        //首先需要创建一个兑现
        Stu stu = stuClass.newInstance();
        //获取指定的需要赋值的变量
        Field name = stuClass.getDeclaredField("name");
        Field gender = stuClass.getDeclaredField("gender");
        Field address = stuClass.getDeclaredField("age");
        //给指定的变量赋值，需要传入之前创建的对象。表示的是为这个对象的属性赋值
        name.set(stu, "zhoujian");
//        gender.set(stu,"男");
        address.set(stu, 10);
        System.out.println(name.get(stu));
//        System.out.println(gender.get(stu));

    }
}

class Stu {
    public String name;
    protected String address;
    int age;
    private String gender;
}
