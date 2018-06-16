package com.atguigu;

public class Main {

    public static void main(String[] args) {

    }
}

class Outer{
    abstract class Inner{
        public abstract void test();
    }
}
//问题？
//类 MyInner 继承  Inner如何实现
//考点
//（1）继承的语法格式：class 子类名  extends  父类名{}
//（2）非静态内部类的全名称：   外部类名.内部类名
//（3）继承抽象类：必须重写抽象类的抽象方法
//（4）要调用非静态内部类的构造器，需要外部类的对象
//（5）子类继承父类时，一定在子类的构造器的首行，一定要调用父类的构造器
class MyInner extends Outer.Inner{
	MyInner(){
		new Outer().super();
	}

//    MyInner(Outer out){
//        out.super();
//    }

    //重写抽象类的抽象方法
    public void test(){

    }
}

class MyOuter extends Outer{
    MyOuter(){
        super();
    }
}