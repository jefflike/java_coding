package com.atguigu;

public class Main {

    public static void main(String[] args) {
        //1. 在堆中创建了两个Integer包装类对象，那么他们的地址肯定不同，比较一定是false
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);//false

        // 2.比较的是基本数据类型的大小，不是比较内存地址了，大小相等
        int i3 = 128;
        int i4 = 128;
        System.out.println(i3 == i4);//true

        // 3. 不过是基本数据类型进行了自动装箱，本质上还是创建了两个包装类的对象，地址不同
        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);//false

        // 小于128的整型在方法区（暂且这么说）有一个常量池，都指向的是这个常量池对象，所以是同一个对象
        int i7 = 1;
        int i8 = 1;
        System.out.println(i7 == i8);//true

        // 由于浮点数的存储机制不同，没有那么大的空间可以存常量，也不精确，所以覅浮点型是没有常量池的
        Double d1 = 2.0;
        Double d2 = 2.0;
        System.out.println(d1 == d2);//false

        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(b1 == b2);//true

        Character c1 = 'a';
        Character c2 = 'a';
        System.out.println(c1 == c2);//true

        // 中文字符也是没有常量池的，字数太多了
        Character c3 = '中';
        Character c4 = '中';
        System.out.println(c3 == c4);//false
    }
}
