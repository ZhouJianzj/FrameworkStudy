package com.zj.reflect;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * @author zhoujian
 */
public class ReflectOne {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //这里需要指定配置文件位置，由于在idea中直接使用先对路径就可以
        //但是这只能在idea中，使用绝对的路径又使得移植性变的很差
        //解决方案就是首先获取到挡墙的线程的再获取到类加载在获取的resource（配置文件相对的路径，
        // 前提是配置文件在类路径下）.在获取getPath（）就可以获取到配置文件的绝对路径
//        方法一
//        String path = Thread.currentThread().getContextClassLoader().getResource("com/zj/reflect/properties.properties").getPath();
//        FileReader fileReader = new FileReader(path.substring(1));

//        方法二，直接以流的方式返回
//        InputStream fileReader = Thread.currentThread().getContextClassLoader().getResourceAsStream("com/zj/reflect/properties.properties");
//        Properties properties = new Properties();
//        properties.load(fileReader);
//        fileReader.close();
//        第三找种方式就是使用java.utils包下的ResourceBundle.getBundle(properties文件名字不能有后缀)
        ResourceBundle properties = ResourceBundle.getBundle("com/zj/reflect/properties");
        String className = properties.getString("ClassName");
//        String className = properties.getProperty("ClassName");
        System.out.println(Class.forName(className).newInstance());



    }
}
