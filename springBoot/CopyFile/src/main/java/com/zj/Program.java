package com.zj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zhoujian
 */
public class Program {
    FileInputStream fileInputStream = null;
    FileOutputStream fileOutputStream = null;
    int length = 0;
    /**
     *
     * @param fileName  需要拷贝的文件，所在的URL
     * @param copySavePalce  文件copy之后索要放的位置
     * @return  是否成功
     */
    public String doCopy(String fileName,String copySavePalce,int l){
        byte[]  b = new byte[1024 * 1024 * l];
        try {
            fileInputStream = new FileInputStream(fileName);
            fileOutputStream = new FileOutputStream(copySavePalce,true);
            while((length = fileInputStream.read(b)) != -1){
                fileOutputStream.write(b,0,length);
                fileOutputStream.flush();
            }
            return "copy susses !";
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            需要分开try catch ，不然只要有一个异常了下面一个就close不掉了
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "copy  fail !";
    }
}
