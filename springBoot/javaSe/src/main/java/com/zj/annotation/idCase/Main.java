package com.zj.annotation.idCase;

import java.lang.reflect.Field;

/**
 * @author zhoujian
 * 测试Stu类中有id注解，当没有id属性的时候就出现异常
 */
public class Main {
    public static void main(String[] args) {
        Class<Stu> stuClass = Stu.class;
        //一个布尔标记
        boolean falg = false;
        //判断类上面是否有Id注解
        if (stuClass.isAnnotationPresent(Id.class)) {
            //有Id注解了就获取里面的属性并且遍历一下时候含有  int 类型的 id 属性
            Field[] declaredFields = stuClass.getDeclaredFields();
            for (Field field : declaredFields) {
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())) {
                    //有就给布尔标记改成true，终止循环
                    falg = true;
                    break;
                }
            }
            //根据布尔标记判断时候要抛出有没有int类型的id属性异常
            if (falg == false) {
                throw new NotHaveIdException("类中没有id属性的错误！");
            }
        }
    }
}
