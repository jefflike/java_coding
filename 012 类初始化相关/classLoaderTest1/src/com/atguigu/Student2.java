package com.atguigu;

public class Student2 {
    //定义一个无参构造器
    Student2(){
        System.out.println("刚运行到构造器时的静态变量值："+name);
//        name = "这是一个无参的构造器";
        System.out.println("构造器结束时的静态变量值："+name);
    }

    //定义一个非静态代码块
    {
        name2 = "非静态name值";
        System.out.println("非静态代码块结束时的静态变量值："+name);
    }
    //定义一个非静态变量
    String name2;

    // 静态代码块
    static{
        System.out.println("运行到静态代码块");
        name = "静态代码块里赋的值";
        //name = 1;
    }

    // 静态变量
    static String name;
}
