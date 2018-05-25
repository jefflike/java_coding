package com.atguigu.bean;

public class Manager extends Employee {
    private double reword;

    public Manager(){}

    public Manager(String name, double salary, double reword){
        super(name, salary);
        this.reword = reword;
    }

    public double getReword() {
        return reword;
    }

    public void setReword(double reword) {
        this.reword = reword;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+",经理奖金"+reword;
//        return "经理姓名：" + getName() + ",经理薪资：" + getSalary()+",经理奖金"+reword;
    }
}
