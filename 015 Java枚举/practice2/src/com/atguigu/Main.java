package com.atguigu;

class TestEnumType {
    public static void main(String[] args) {

        Season s = Season.SPRING;
        System.out.println(s);
//        System.out.println(enumTest.FALL.test());

    }
}
class Season{
    //2、预先创建好固定的几个对象供外界使用
    public static final Season SPRING = new Season("春天");
    public static final Season SUMMER = new Season("夏天");
    public static final Season FALL = new Season();
    public static final Season WINTER = new Season();

    private String description;


    //1、构造器私有化
    private Season(){

    }
    private Season(String description){
        this.description = description;
    }

    public String toString(){
        return "SPRING:" + description;
    }

    public void test(){
        System.out.println("枚举的非静态方法");
    }
}

//enum enumTest extends Enum{//不能继承最高的父类
enum enumTest {
    SPRING(Season.SUMMER),//调用有参构造器
    SUMMER,//调用的无参构造器
    FALL;
    private Season seson;

    //1、构造器私有化
    private enumTest(){
        this.seson = Season.SPRING;
        System.out.println(Season.SPRING);
    }
    private enumTest(Season seson){
        this.seson = seson;
    }

    public void test(){
        System.out.println("枚举的非静态方法");
    }
}
