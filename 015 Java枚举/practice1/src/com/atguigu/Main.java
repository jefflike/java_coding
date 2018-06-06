package com.atguigu;

public class Main {

    public static void main(String[] args) {
	    Employee[] employees = new Employee[5];
	    employees[0] = new Employee("老大", Status.FREE, 20000);
	    employees[1] = new Employee("老二", Status.BUSY, 12000);
	    employees[2] = new Employee("老三", Status.VOCATION, 15000);
	    employees[3] = new Employee("老四", Status.LEFT, 10000);
	    employees[4] = new Employee("老五", Status.FREE, 20000);

        for (Employee e:employees) {
            System.out.println(e.getStatus());
        }
    }
}
