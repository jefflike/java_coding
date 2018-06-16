package com.atguigu;

public class Main {
    // JDK1.5之前的手挡装箱，拆箱操作
    public static void main(String[] args) {
        //1、创建一个包装类的对象
        Integer i = new Integer(12);

        //2、手动装箱操作
        int a = 10;
        //需要把变量a的值存储到集合，或传给引用数据类型的形参时，那么就需要把a变成包装类对象
        Integer num = new Integer(a);

        //3、手动拆箱操作
        Integer n1 = new Integer(10);
        Integer n2 = new Integer(20);

        //例如：求和，对象不能直接相加,拆箱成基本数据类型
        int m1 = n1.intValue();
        int m2 = n2.intValue();
        System.out.println(m1 + m2);
    }
}
