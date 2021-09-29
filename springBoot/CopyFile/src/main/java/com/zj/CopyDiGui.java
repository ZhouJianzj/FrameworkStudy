package com.zj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author zhoujian
 */
public class CopyDiGui {
    private String src = null;
    private FileOutputStream fileOutputStream = null;
    private FileInputStream fileInputStream = null;
    private byte[] bytes = null;

    public static void main(String[] args) throws IOException {
        CopyDiGui copyDiGui = new CopyDiGui();
        copyDiGui.dodo("D:\\workspace\\文档", "D:\\", 1);

    }

    /**
     * @param src  拷贝文件的起始位置
     * @param dest save 文件的地方
     * @param mB   传输速度
     */
    public void dodo(String src, String dest, int mB) throws IOException {
        File in = new File(src);
        this.src = in.getParent();
        bytes = new byte[1024 * 1024 * mB];
        File out = new File(dest);
        if (copyDir(in, out)) {
            endStream();
        }


    }

    public boolean copyDir(File in, File out) throws IOException {
        if (in.isFile()) {
            System.out.println(in.getAbsolutePath());

            String substring = in.getAbsolutePath().substring(src.length());

            System.out.println(out + substring);

            fileInputStream = new FileInputStream(in.getAbsolutePath());
            fileOutputStream = new FileOutputStream(out + substring, true);
            int a = 0;
            while ((a = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, a);
                fileOutputStream.flush();
            }

            return true;
        }
        //获取in的所有子目录包括文件
        File[] files = in.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                //获取源文件夹的绝对目录
                String srcPackageAbsolutePath = file.getAbsolutePath();
//                System.out.println(srcPackageAbsolutePath);
                String substring = srcPackageAbsolutePath.substring(src.length());
//                System.out.println(out + substring);
                File f = new File(out + substring);
                if (!(f.exists())) {
                    f.mkdirs();
                }
            }
            copyDir(file, out);
        }
        return false;
    }

    public void endStream() {
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
