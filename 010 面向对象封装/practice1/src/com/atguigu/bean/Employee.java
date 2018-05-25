/*
1、创建一个员工类Employee，com.atguigu.bean
有属性：姓名，薪资
属性私有化，get/set，有一个getInfo：返回员工类信息
2、创建一个经理类Manager，com.atguigu.bean
经理类继承Employee，并且扩展了一个属性：奖金
属性私有化，get/set，有一个getInfo：返回经理类信息
3、创建一个部长Minister，com.atguigu.bean
部长类继承经理类Manager，并且扩展了一个属性：股票
属性私有化，get/set，有一个getInfo：返回部长类信息
4、创建一个测试类TestEmployees，com.atguigu.test
在main方法中，创建Employee,Manager，Minister对象，并打印信息
*/
package com.atguigu.bean;

public class Employee {
    private String name;
    private double salary;

    public Employee(){}

    public Employee(String name, double salary){
        this.name =name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getInfo() {
        return "员工姓名：" + name + ",员工薪资：" + salary;
    }
}
