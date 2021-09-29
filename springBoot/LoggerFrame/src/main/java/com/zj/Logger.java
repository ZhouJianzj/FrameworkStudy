package com.zj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

/**
 * @author zhoujian
 */
public class Logger {
    /**
     * 系统输出流
     */
    private PrintStream printStream = null;
    /**
     * 输出到文件的输出流
     */
    FileOutputStream fileOutputStream = null;
    /**
     * 保存原始的输出流，一遍恢复打印到控制台
     */
    PrintStream out = null;
    /**
     * 计数，控制log文件开始时间的打印次数的
     */
    int count = 0;

    public Logger() {
    }

    /**
     * 方便创建对象的时候直接启动日志
     *
     * @param logFileURL 存放日志路径
     */
    public Logger(String logFileURL) {
        doSet(logFileURL);
    }

    /**
     * 方法调用启动服务
     *
     * @param logFileURL log存放位置
     * @return 是否日志启动成功
     */
    public boolean startLogger(String logFileURL) {
        return doSet(logFileURL);
    }

    /**
     * 底层启动服务，并且控制台打印log启动状态
     *
     * @param logFileUR log Save 位置
     * @return 是否启动成功
     */
    private boolean doSet(String logFileUR) {
//     复以前的样子 关键点在这
        out = System.out;
        doDoSet(logFileUR);
        System.setOut(out);
        System.out.println("Log启动成功！");
        count++;
        doDoSet(logFileUR);
        return true;
    }

    /**
     * 底层底层的启动
     *
     * @param logFileUR log 存放位置
     */
    private void doDoSet(String logFileUR) {
        try {
            fileOutputStream = new FileOutputStream(logFileUR, true);
            printStream = new PrintStream(fileOutputStream);
            System.setOut(printStream);
            if (count == 1) {
                Date date = new Date();
                System.out.println(date);
            }
            System.out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 终止服务
     *
     * @return log服务结束
     */
    public boolean endLogger() {
        if (printStream != null && fileOutputStream != null) {
            printStream.close();
            System.setOut(out);
            System.out.println("log服务终止！");
            return true;
        }
        return false;
    }


}
