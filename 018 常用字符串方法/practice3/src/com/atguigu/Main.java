package com.atguigu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Date d = new Date();
        //涉及到日期时间的计算，比较等，本质上是用毫秒值计算，比较
        long time = d.getTime();
        System.out.println(time);// 1528339770100

        Date d1 = new Date(666666666666L);// 将时间戳的时间转换成当时的距离1970年的时间
        System.out.println(d1);// Sat Feb 16 09:11:06 CST 1991

        //在创建SimpleDateFormat对象时，需要指定日期时间的格式
        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss SSS");
        String s = sf.format(d1);//把d这个日期按照这个格式，进行换换为字符串
        System.out.println(s);//1991年02月16日   09:11:06 666

        sf = new SimpleDateFormat("yyyy年MM月dd日是这一年的第D天");
        s = sf.format(d1);
        System.out.println(s);// 1991年02月16日是这一年的第47天

        sf = new SimpleDateFormat("yyyy年MM月dd日是E");
        s = sf.format(d1);
        System.out.println(s);// 1991年02月16日是星期六

        Calendar instance = Calendar.getInstance();//根据当前操作系统默认的时区，语言环境来获取一个日历对象
        System.out.println(instance);

        Calendar can = Calendar.getInstance(Locale.CANADA);//选择时区
        System.out.println(can);

        //获取年份
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH) + 1;//0-11
        int date = instance.get(Calendar.DATE);
        int day = instance.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年" + month + "月" + date + "日");// 2018年6月7日
        System.out.println(year + "年" + month + "月" + day + "日");// 2018年6月7日

//		int hour = instance.get(Calendar.HOUR);//12小时制
        int hour = instance.get(Calendar.HOUR_OF_DAY);//24小时制
        int minute = instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);
        int milsecond = instance.get(Calendar.MILLISECOND);
        System.out.println(hour + ":" + minute + ":" + second + " " + milsecond);// 11:4:58 618
    }
}
