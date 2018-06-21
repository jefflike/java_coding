package com.jeff_code;

public class Main {

    public static void main(String[] args) {
        // String:"1", Integer对象:1，与int:1三者之间的转换关系

        // 1. Integer转换为String的三种方式
        // 1.1将Integer转换为String
        Integer int1 = new Integer(1);
        Integer int2 = null;
        String str1 = Integer.toString(int1);
        // String str11 = Integer.toString(int2);// 当Integer对象为空时,空指针异常

        System.out.println(str1 instanceof String);// true

        // 1.2将Integer转换为String
        String str2 = int1.toString();
//        String str21 = int2.toString(); // 同样是空指针
        System.out.println(str2 instanceof String);// true

        // 1.3将Integer转换为String
        String str3 = String.valueOf(int1);
        String str31 = String.valueOf(int2);
        String str32 = null;
        System.out.println(str2 instanceof String);// true
        System.out.println(str31 instanceof String);// true
        System.out.println(str32 instanceof String);// false


        // 2. String转换成Integer

        // 2.1
        String s2 = "2";
        Integer i2 = Integer.valueOf(s2);
        System.out.println(i2 instanceof Integer);// true

        // 2.2
        Integer i3 = new Integer(s2);
        System.out.println(i3 instanceof Integer);// true

        // 3. String转换成int
        // 3.1
        String s3 = "3";
        int i4 = Integer.parseInt(s3);

        // 3.2 这两种给隐藏了自动拆箱的过程
        int i5 = new Integer(s3);
        int i6 = Integer.valueOf(s3);

        // 4. int转换成String
        // 4.1
        String s4 = 5 + "";

        // 5. int与Integer之间的转换就是拆装箱的操作

        // 5.1 手动装箱
        Integer i7 = new Integer(5);

        // 5.2 自动装箱
        Integer i8 = 5;

        // 5.3 手动拆箱
        int i9 = i7.intValue();

        // 5.4 自动拆箱
        int int10 = i8;

        /*
        * 总结： 1. int,integer与String之间的转换方式非常的丰富；
        * 2. 在使用类型方法的时候记住不要是null对象调用，即注意空指针异常；
        * */
    }
}
