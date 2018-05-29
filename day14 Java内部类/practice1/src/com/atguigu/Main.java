package com.atguigu;
// 静态成员内部类
public class Main {

    public static void main(String[] args) {
        // 3.在外部类的外面调用内部类的静态属性方法
        Outer.Inner.methodIn();
        // 创建内部类对象
        Outer.Inner obj = new Outer.Inner();
        obj.testIn();

    }
}

class Outer{
    private String outField = "外部类非静态属性";
    private static String outStaticField = "外部类静态属性";

    static class Inner{
        public void testIn(){
            // 1. 静态内部类使用外部类的属性
			//System.out.println("outField=" + outField);//无法使用非静态的属性，Non-static field 'outField' cannot be referenced from a static context
            System.out.println("outStaticField=" + outStaticField);
        }

        public static void methodIn(){
            System.out.println("内部类的静态方法");
        }
    }

    // 2.在外部类中使用内部类的属性与方法
    public static void OutUseInt(){
        //使用内部类的静态属性与方法
        Inner.methodIn();
        //使用内部类的非静态属性与方法
        new Inner().testIn();
    }
    static {
        //1. 使用内部类的静态属性与方法
        Inner.methodIn();
        // 2. 使用内部类的非静态属性与方法
        new Inner().testIn();
    }
}