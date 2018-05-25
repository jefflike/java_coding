package com.atguigu.exer2.bean;

public class Employee {
    private String level;
    private String name;
    private double salary;

    public Employee(String level,String name, double salary){
        this.level = level;
        this.name = name;
        this.salary = salary;
    }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBasicInfo(){
        return "姓名："+name+",薪资："+salary;
    }

    public String getInfo(){
        return "我是一个普通的员工"+getBasicInfo();
    }
}
