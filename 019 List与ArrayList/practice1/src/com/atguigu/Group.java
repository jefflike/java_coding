package com.atguigu;

import java.util.Iterator;
import java.util.LinkedList;

public class Group {
    public void addMember(){
        LinkedList list = new LinkedList();
        list.add("玛丽莎");
        list.add("牛爱国");
        list.add("郭旺王");
        list.add("将成名");
        list.add("宁小军");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Object next = iterator.next();
            if("宁小军".equals(next)){
                iterator.remove();
            }
        }

        for (Object obj:list){
            System.out.println(obj);
        }
    }
}

class Group2 {
    public void addMember(){
        Student s1 = new Student(1, "玛丽莎", 16);
        Student s2 = new Student(2, "牛爱国", 30);
        Student s3 = new Student(3, "郭旺王", 23);
        Student s4 = new Student(4, "将成名", 25);
        Student s5 = new Student(5, "宁小军", 24);

        LinkedList list = new LinkedList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Object next = iterator.next();
            if("宁小军".equals(((Student)next).getName())){
                iterator.remove();
            }
        }

        for (Object obj:list){
            System.out.println(obj);
        }
    }
}