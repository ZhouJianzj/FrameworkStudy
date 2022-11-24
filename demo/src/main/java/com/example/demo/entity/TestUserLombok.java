package com.example.demo.entity;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * lombok 的便捷式注解使用，让代码比德芙还丝滑
 * 参考官网文档的个人Demo
 *
 * @author zhoujian
 */

//打日志
@Slf4j
//@Logger
//@Log
//@Log4j
//@Log4j2
//@CommonsLog
//@JBossLog
public class TestUserLombok {

    @NoArgsConstructor
    @AllArgsConstructor
    @Setter
    @Getter
    //指定属性参与对象比较条件
    @EqualsAndHashCode(of = {"name", "id"})
    //ToString指定属性
    @ToString(of = {"name"})
    public static class TestOne {
        private String name;
        private Integer id;
    }

    //这里指定无参构造为private对象的单例模式不就有了吗
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    //为每个需要特殊处理的字段生成一个带有1个参数的构造函数。所
//    @RequiredArgsConstructor
    public static class TestTwo {
        String name;
        Integer id;
    }

    //Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
    @Data
    //Equivalent to @Getter @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE) @AllArgsConstructor @ToString @EqualsAndHashCode.
    @Value
    //链式编程， setter方法返回的是当前对象
    @Accessors(chain = true)
    public static class TestThree {

    }

    //构造模式
    @Builder
    public static class TestFour {
        private String name;
        private Integer id;
        @Singular("addHobby")
        private List<String> hobby;
    }

    @Data
    @Accessors(fluent = true)
    public static class TestFive {
        String name;
        Integer id;
        String go;
    }


    @Data
    @Accessors(chain = true)
    //获取属性name
    @FieldNameConstants
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    private static class TestFieldConstant{
        public final static Integer AGE = 22;
        String name;
        Integer id;
    }


    public static void main(String[] args) {
        //testOne
        System.out.println(new TestOne("zj", 22));

        //testFour
        System.out.println(TestFour.builder().id(11).name("zj").addHobby("playGame").addHobby("playAllGame"));

        //testFive
        TestFive testFive = new TestFive();
        testFive.name("zhoujian");
        System.out.println(testFive.name());

        //testFieldConstant
        System.out.println(TestFieldConstant.Fields.id);
        System.out.println(TestFieldConstant.Fields.name);
    }

    /**
     * 鬼鬼祟祟的try catch
     */
    @SneakyThrows
    public void testSneaky() {
        Thread.sleep(1000);
    }

    @SneakyThrows
    public void testOutInStream(String in, String out) {
        //自动关闭操作
        @Cleanup
        FileInputStream fileInputStream = new FileInputStream(in);
        @Cleanup
        FileOutputStream fileOutputStream = new FileOutputStream(out);
        byte[] bytes = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bytes);
            if (read == -1) {
                break;
            }
            fileOutputStream.write(bytes, 0, read);
        }
    }

    /**
     * 诡计多端的命名参数
     */
    public void testTricky() {
        var list = new ArrayList<String>();
        val list2 = new ArrayList<String>();


    }



}
