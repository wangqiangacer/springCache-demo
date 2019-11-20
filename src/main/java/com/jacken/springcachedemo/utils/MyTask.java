package com.jacken.springcachedemo.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;


/**
 * 任务类
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world");
        }
        System.out.println("end.......");
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        //1秒后执行 每隔1秒钟执行
        Calendar calendar=new GregorianCalendar(2019,10,20,19,35);
        //System.out.println(calendar.getTime());
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

         timer.schedule(new MyTask(),calendar.getTime(),200);
    }
}
