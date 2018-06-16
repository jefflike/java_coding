package com.atguigu;

//public class Main {
//
//    public static void main(String[] args) {
//	C c= new C();
//    }
//}
//
//class A{
//    A(){
//        System.out.println("A的无参构造器");
//    }
//}
//
//class B extends A{
////    B(int a){
//    B(){
//        System.out.println("B的无参构造器");
//    }
//}
//
//class C extends B{
//    C(){
//        System.out.println("C的无参构造器");
//    }
//}

class Student{
    private static String name;

//    void setName(String name){
//        this.name = name;
//    }
//    String getName(){
//        return name;
//    }

    static {
        name = "山鸡";
    }

    Student(){
        //this(this.name);
        this(name);
        System.out.println("题目要求写一个无参的构造器");
    }

    Student(String name){
        this.name = name;
        System.out.println(name);
    }

}
class TestStudent{
    public static void main(String[] args){
        Student stu1 = new Student();
    }
}