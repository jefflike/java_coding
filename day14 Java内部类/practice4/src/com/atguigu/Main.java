package com.atguigu;

class TestAnonymousInner {

    public static void main(String[] args) {
        //这个f1指向的是Father的子类的对象
        //多态引用
        Father f1 = new Father(){

        };
        System.out.println(f1.getClass());// class com.atguigu.TestAnonymousInner$1

        Father f2 = new Father(){

        };
        System.out.println(f2.getClass());// class com.atguigu.TestAnonymousInner$2

        Father f3 = new Father(){
            //重写父类的方法
            @Override
            public void test(){
                System.out.println("子类3重写父类的方法");
            }
        };
        f3.test();// 子类3重写父类的方法

        final int a = 10;

        //右边是FuInter的实现类，要实现接口的抽象方法
        FuInter f4 = new FuInter(){

            @Override
            public void test() {
                System.out.println("实现类要实现，重写父类的抽象方法");
                System.out.println("a = " + a);
            }

        };
        f4.test();

        //右边是Mother的子类，子类必须调用父类的构造器，需要手动调用父类的有参构造
        Mother m = new Mother("尚硅谷"){

        };
    }

}
class Father{
    public void test(){
        System.out.println("父类的测试方法");
    }
}

interface FuInter{
    void test();
}

class Mother{
    //只有一个有参构造
    Mother(String info){
        //...
    }
}
