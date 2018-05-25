package com.atguigu.exer2.test;

import com.atguigu.exer2.bean.*;

public class TestEmployees {
    public static void main(String[] args){
        Employee p = new Employee("员工","老大", 2000);
        Manager ma = new Manager("经理", "老二", 5000, 2000);
        Minister mi = new Minister("部长", "老san", 8000, 5000, 1000);
        Employee[] emm = new Employee[]{p, ma, mi};

        for (Employee a : emm){
            System.out.println(a.getInfo());
    }
    }
}
