package com.atguigu;

public class Main {

    public static void main(String[] args) {
        //3.在外部类的外面调用内部非静态成员内部类
        // 先创建的是外部类的对象
        Outer out = new Outer();
        // 方法一：创建一个内部非静态成员类的对象
        Outer.Inner in = out.new Inner();//这种写法略微有点怪异了，一般也不使用这种方式。但是这么做是可以的
        //最后就是使用了
        in.testIn();
        // 方法二：getInner方法
        Outer.Inner in1 = out.getInner();
        in1.testIn();
    }
}

class Outer{
    private String outField = "外部类的非静态属性";
    private static String outStaticField = "外部类的静态属性";

    class Inner{
        public static final int MAX_VALUE = 10000;//常量可以
//		private static String inField;//非静态类中不能声明一个静态的属性或方法

        public void testIn(){
            // 1.非静态成员类中可以使用外部类的静态或非静态的属性与方法
            System.out.println("outField =" + outField);
            System.out.println("outStaticField =" + outStaticField);
        }
    }

    public void testOut(){
        //2.在外部类中调用非静态成员内部类的属性与方法
        Inner in = new Inner();
        in.testIn();
    }

    public Inner getInner(){
        return new Inner();
    }
}