package com.atguigu;

public class SuperClass {
    //父类与子类都在一个包中，这里我们就使用default修饰符
    //这是一个父类的静态变量,此时还是初始化的默认值null
    static String superStaticVariale;

    // 静态代码块，给String赋值
    static {
        superStaticVariale = "父类静态代码块赋值成功";
        System.out.println("此时运行的是父类的静态代码块："+superStaticVariale);
    }

    // 无参构造，覆盖静态代码块的值
    SuperClass(){
        superStaticVariale = "父类构造器赋值成功";
        System.out.println("此时运行的是父类的构造器："+superStaticVariale);
    }

    //定义一个非静态变量
    String superVariale;

    // 定义一个非静态代码块
    {
        superVariale = "父类非静态代码块赋值";
        System.out.println("此时运行的是父类的非静态代码块："+superVariale);
    }
}
