package com.atguigu;

public class SubClass extends SuperClass{
    static String subStaticVariale;

    // 静态代码块，给String赋值
    static {
        subStaticVariale = "子类静态代码块赋值成功";
        System.out.println("此时运行的是子类的静态代码块："+subStaticVariale);
    }

    // 无参构造，覆盖静态代码块的值
    SubClass(){
        superStaticVariale = "子类构造器赋值成功";
        System.out.println("此时运行的是子类的构造器："+superStaticVariale);
    }

    //定义一个非静态变量
    String subVariale;

    // 定义一个非静态代码块
    {
        subVariale = "子类非静态代码块赋值";
        System.out.println("此时运行的是子类非静态代码块："+subVariale);
    }
}
