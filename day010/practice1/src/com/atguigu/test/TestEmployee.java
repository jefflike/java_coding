package com.atguigu.test;
import com.atguigu.bean.Manager;
import com.atguigu.bean.Minister;
import com.atguigu.bean.Employee;

public class TestEmployee {
    public static void main(String[] args){
        Employee e1 = new Employee("老大", 1000);
        Manager ma1 = new Manager("老二", 2000, 500);
//        Minister mi1 = new Minister("老三", 5000, 2000, 100000);
        Minister mi1 = new Minister();
        System.out.println(e1.getInfo());
        System.out.println(ma1.getInfo());
        System.out.println(mi1.getInfo());
        mi1.setName("老四");
        System.out.println(mi1.getInfo());
    }
}
