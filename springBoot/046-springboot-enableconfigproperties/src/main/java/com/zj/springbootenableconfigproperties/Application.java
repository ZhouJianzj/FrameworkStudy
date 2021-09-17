package com.zj.springbootenableconfigproperties;

import com.zj.springbootenableconfigproperties.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

//        Dog dog = (Dog) context.getBean("dog-com.zj.Dog");
//        System.out.println(dog.getName());
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//       for (int a = 0;a < beanDefinitionNames.length;a++){
//           System.out.println(beanDefinitionNames[a]);
//       }
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

    }

}
