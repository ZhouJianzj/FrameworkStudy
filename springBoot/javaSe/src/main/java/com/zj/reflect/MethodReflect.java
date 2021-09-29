package com.zj.reflect;

import java.lang.reflect.*;

/**
 * @author zhoujian
 */
public class MethodReflect {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        //获取class
        Class<MethodR> methodRClass = MethodR.class;
        //获取类的父类
        System.out.println(methodRClass.getSuperclass());
        //获取类的接口
        System.out.println(methodRClass.getInterfaces().length);
        //创建对象
        MethodR methodR = methodRClass.newInstance();
        //创建容器
        StringBuilder stringBuffer = new StringBuilder();
        //获取方法
        Method[] declaredMethods = methodRClass.getDeclaredMethods();
        //先对class进行处理
        stringBuffer.append(Modifier.toString(methodRClass.getModifiers()) + " ");
        stringBuffer.append("class" + " ");
        stringBuffer.append(methodRClass.getSimpleName() + '{' + "\n");

        //处理参数
        Field[] declaredFields = methodRClass.getDeclaredFields();
        for (Field f : declaredFields) {
            stringBuffer.append("\t" + Modifier.toString(f.getModifiers()) + " ");
            stringBuffer.append(f.getType().getSimpleName() + " ");
            stringBuffer.append(f.getName() + ";" + "\n");
        }
        //处理方法
        //构造方法
        Constructor<?>[] declaredConstructors = methodRClass.getDeclaredConstructors();
        boolean fagle = false;
        for (Constructor c : declaredConstructors) {
            stringBuffer.append("\t" + Modifier.toString(c.getModifiers()) + " ");
            stringBuffer.append(c.getName() + "(");
            Class[] parameterTypes = c.getParameterTypes();

            for (Class p : parameterTypes) {
                fagle = true;
                stringBuffer.append(p.getSimpleName() + ",");
            }
            if (fagle) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            stringBuffer.append(")" + "{}" + "\n");

        }
        //其它方法
        for (Method method : declaredMethods) {
            //方法修饰符
            stringBuffer.append("\t" + Modifier.toString(method.getModifiers()) + " ");
            //方法返回值
            stringBuffer.append(method.getReturnType().getSimpleName() + " ");
            //方法名字
            stringBuffer.append(method.getName() + "(");
            //方法的参数
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class c : parameterTypes) {
                stringBuffer.append(c.getSimpleName() + ",");
            }
            //截取掉最后一个，
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            stringBuffer.append(")" + "{" + "\n");
            //调用方法
//           stringBuffer.append( method.invoke(methodR,"zhoujian") + "\n");

            stringBuffer.append("\t" + "}" + "\n");
        }
        stringBuffer.append("}");
        System.out.println(stringBuffer);
    }

}

class MethodR implements InterfaceOne, InterfaceTwo {
    private String name;
    public String id;
    int age;
    protected String address;


    public MethodR() {
    }

    public MethodR(String name, String id, int age, String address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
    }

    public String doDo(String args) {

        return "============方法执行===============" + args;
    }
}
