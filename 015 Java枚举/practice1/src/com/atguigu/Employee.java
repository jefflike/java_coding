package com.atguigu;

public class Employee {
    private String name;
    private Status status = Status.FREE;
    private double salary;

    Employee(){}
    Employee(String name, Status status, double salary){
        this.name = name;
        this.status = status;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
