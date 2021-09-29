package com.zj.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author zhoujian
 */
public class TimeTest {
    public static void main(String[] args) {
        try {
            Timer timer = new Timer();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = simpleDateFormat.parse("2021-7-13 9:50:00");

            System.out.println(parse);

            timer.schedule(new TimeTaskT(), parse, 1000 * 2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

class TimeTaskT extends TimerTask {

    @Override
    public void run() {
        System.out.println("============时间到++++++++++++");
    }
}

