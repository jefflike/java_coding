package com.atguigu;

public class SuperClass {
    //父类与子类都在一个包中，这里我们就使用default修饰符
    //这是一个父类的静态变量,此时还是初始化的默认值null
    static String superStaticVariale;

    // 静态代码块，给String赋值
    static {
        superStaticVariale = "父类静态代码块赋值成功";
    }

    // 无参构造，覆盖静态代码块的值
    SuperClass(){
        superStaticVariale = "父类构造器赋值成功";
    }

    //定义一个非静态变量
    String superSVariale;

    // 定义一个非静态代码块
    {
        superSVariale = "父类非静态代码块赋值";
    }
}
