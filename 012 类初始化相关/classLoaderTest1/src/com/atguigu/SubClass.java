package com.atguigu;

public class SubClass {
    static String superStaticVariale;

    // 静态代码块，给String赋值
    static {
        System.out.println("此时子类的静态变量："+superStaticVariale);
        superStaticVariale = "子类静态代码块赋值成功";
        System.out.println("此时子类的静态代码块赋值成功："+superStaticVariale);
    }

    // 无参构造，覆盖静态代码块的值
    SubClass(){
        System.out.println("此时子类的构造器："+superStaticVariale);
        superStaticVariale = "子类构造器赋值成功";
        System.out.println("此时子类的构造器完成："+superStaticVariale);
    }

    //定义一个非静态变量
    String superSVariale;

    // 定义一个非静态代码块
    {
        System.out.println("此时子类的非静态变量："+superSVariale);
        superSVariale = "子类非静态代码块赋值";
        System.out.println("此时子类的非静态变量："+superSVariale);
    }
}
