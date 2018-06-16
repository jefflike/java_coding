package com.atguigu;

public class Main {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.test();
        //A：使用Inner类型不可以
//		Outer.Inner//错误的，没有这个字节码文件的生成

        //B：获取到Inner的对象，使用多态引用
        Object obj = Outer.method();
        System.out.println(obj);
    }
}

class Outer{
    private String outField;
    private static String outStaticField;
    private  int a = 20;

    public void test(){
        int a = 10;//局部变量

//        Inner in = new Inner();//会报错，需要先声明后使用
//        in.testIn();

        //局部内部类
        class Inner{
            private static final String NAME = "常量";//常量
//			private static String info;//局部内部类没有静态的属性方法

            public void testIn(){
                // 1. 有名字的局部内部类调用外部类的属性与方法
                System.out.println("outField = " + outField);// outField = null
                System.out.println("outStaticField = " + outStaticField); //outStaticField = null
                System.out.println("a = " + a);//使用外部类的局部变量 // a = 10
            }
        }

        Inner in = new Inner();//先声明后使用，有作用域
        in.testIn();
    }

    public void testInner(){
//		Inner in = new Inner();//作用域隔离
    }

    public static Object method(){
        //局部内部类
        class Inner{
            private static final String NAME = "常量";//常量

            public void testIn(){
//				System.out.println("outField = " + outField);//方法是静态的，局部内部类则不能调用非静态的属性
                System.out.println("outStaticField = " + outStaticField);
//              System.out.println("a = " + a);//使用外部类的局部变量
            }
        }

        return new Inner();
    }
}