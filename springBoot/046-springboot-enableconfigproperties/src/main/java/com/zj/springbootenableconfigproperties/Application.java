package com.zj.springbootenableconfigproperties;

import com.zj.Dog;
import com.zj.springbootenableconfigproperties.config.PersonConf;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

//        Dog dog = (Dog) context.getBean("dog-com.zj.Dog");
//        System.out.println(dog.getName());
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
       for (int a = 0;a < beanDefinitionNames.length;a++){
           System.out.println(beanDefinitionNames[a]);
       }

    }

}
