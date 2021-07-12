package com.zj;

import java.io.File;

/**
 * @author zhoujian
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("D:\\AAa");
        file.mkdirs();
//        File file = new File("D:\\workspace");
        //展示这个路径下的所有文件
//        File[] files = file.listFiles();

//         展示所有文件
//        for (File f : files){
//            System.out.println(f.getName());
//
//        }

//        for (File f : files){
////            判断是否为文件的
//            if (f.isFile()){
//                System.out.println(f.getName());
//            }
//        }
////          判断是否为文件夹
//        for (File f : files){
//            if (f.isDirectory()){
//                System.out.println(f.getName());
//            }
//        }
    }
}
