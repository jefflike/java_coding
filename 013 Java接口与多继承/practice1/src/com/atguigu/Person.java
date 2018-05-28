package com.atguigu;

public class Person implements Runable {
    @Override
    public void run() {
        System.out.println("人在跑");
    }
}
