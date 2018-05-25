package com.atguigu.exer2.bean;

public class Minister extends Manager{
    private int stock;

    public Minister(String level,String name, double salary, double bonus, int stock){
        super(level, name, salary, bonus);
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String getBasicInfo() {
        return super.getBasicInfo()+"，股票："+stock;
    }

    @Override
    public String getInfo() {
        return "我是一个部长"+getBasicInfo();
    }
}
