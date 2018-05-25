package com.atguigu;

class Student{
    // 静态变量
    static String name;

    // 静态代码块
    static{
        System.out.println("刚运行到静态代码块时的静态变量值："+name);
        //name = "静态name值";
        System.out.println("静态代码块结束时的静态变量值："+name);
    }

    //定义一个无参构造器
    Student(){
        this(name);
        System.out.println("刚运行到构造器时的静态变量值："+name);
        name = "这是一个无参的构造器";
        System.out.println("构造器结束时的静态变量值："+name);
    }

    //定义一个有参构造器
    Student(String a){
        System.out.println("刚运行到有参构造器时的静态变量值："+name);
        name = a;
        System.out.println("有参构造器结束时的静态变量值："+name);
    }

    //定义一个非静态变量
    String name2;

    //定义一个非静态代码块
    {
        System.out.println("刚运行到非静态代码块时的非静态变量值："+name2);
        name2 = "非静态name值";
        System.out.println("非静态代码块结束时的非静态变量值："+name2);
    }
}

