package com.zj;

import java.util.Scanner;

/**
 * Copy
 *  适用于较大的文件传输
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("请输入你要Copy文件位置!(示例：D:\\a.txt,支持所有文件格式拷贝)");
        String copy = new Scanner(System.in).nextLine();

        System.out.println("请输入你预期传输速度 MB/s:（数字即可）");
        int mB = new Scanner(System.in).nextInt();

        System.out.println("请输入你需要Save文件的位置！(示例：D:\\a.txt)");
        String save = new Scanner(System.in).nextLine();

//        if (copy !=null || " ".equals(copy) ||
//                save != null || " ".equals(save) ||
//                    mB != 0){
            System.out.println(new Program().doCopy(copy, save,mB));
//           try{
//               CopyDiGui copyDiGui = new CopyDiGui();
//               copyDiGui.dodo(copy,save,mB);
//           }catch (IOException e) {
//
//           }
//        }
    }
}
