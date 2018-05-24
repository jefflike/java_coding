package com.atguigu.bean;

public class Minister extends Manager {
    private double guPiao;

    public Minister(){}

    public Minister(String name, double salary, double reword, double guPiao){
        super(name, salary, reword);
        this.guPiao =guPiao;
    }

    public void setGuPiao(double guPiao) {
        this.guPiao = guPiao;
    }

    public double getGuPiao() {
        return guPiao;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +"，部长股票："+ guPiao;
//        return "部长姓名：" + getName() + ",部长薪资：" + getSalary()+",部长奖金"+getReword() +"，部长股票："+ guPiao;
    }
}
