package com.atguigu.exer2.bean;

public class Manager extends Employee{
    private double bonus;

    public Manager(String level,String name, double salary, double bonus){
        super(level, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getBasicInfo() {
        return super.getBasicInfo()+"奖励："+bonus;
    }

    @Override
    public String getInfo() {
        return "我是一个经理" + getBasicInfo();
    }

}
