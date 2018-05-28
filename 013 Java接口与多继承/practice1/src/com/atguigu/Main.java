/*
* 1、声明一个接口Runnable
接口中有一个抽象方法：void run()

2、声明一个Car类，实现Runnable接口

3、声明一个Person类，实现Runnable接口

4、声明一个Dog类，实现Runnable接口

5、在测试类1中声明一个方法
public static void print(Runnable r){
	如果是Car对象，就打印，这是一辆车，并调用Car的run()
	如果是Person对象，就打印，这是一个人，并调用Person的run()
	如果是Dog对象，就打印，这是一只狗，并调用Dog的run()

}
并在主方法中调用

6、在测试类2中，创建一个Runnable数组，并存储各种实现类对象，并遍历数组，调用run()方法
* */
package com.atguigu;

public class Main {

    public static void main(String[] args) {
	Runable dog1 = new Dog();
	Runable person1 = new Person();
	Runable car1 = new Car();

	print(dog1);
	print(person1);
	print(car1);

	Runable[] arr = new Runable[]{dog1, person1, car1};
	for (Runable myRun : arr){
	    myRun.run();
    }
    }

    public static void print(Runable r){
        if(r instanceof Car){
            System.out.println("这是一辆车");
            r.run();
        }else if(r instanceof Person){
            System.out.println("这是一个人");
            r.run();
        }else {
            System.out.println("这是一条狗");
            r.run();
        }
    }
}
