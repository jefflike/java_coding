package com.atguigu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	new TestByte().test1();
//	new TestInteger().test1();
//        String a = "jeff";
        MyString m = new MyString("jeff");
        System.out.println(m);
    }
}

class TestByte{
    public void test1(){
        System.out.println(Byte.TYPE);
        byte a = 10;
        System.out.println(Byte.valueOf(a));
    }
}

class TestInteger{
    public void test1(){
        System.out.println(Integer.toString(10, 18));// a
    }
}

class MyString{
    private final char[] value;

    public MyString(){
        this.value = new char[0];
    }
    public MyString(char[] value){
        char[] v = Arrays.copyOfRange(value, 0, value.length);
        this.value = v;
    }

    public MyString(String str){
        char[] value = str.toCharArray();
        this.value = value;
    }

    public char[] toCharArray(){
        char[] v = Arrays.copyOfRange(value, 0, value.length);
        return v;
    }

    @Override
    public String toString() {
        return Arrays.toString(value);
    }
}