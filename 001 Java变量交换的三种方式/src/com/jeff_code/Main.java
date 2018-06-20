package com.jeff_code;

public class Main {

    public static void main(String[] args) {
        int var1 = 3;
        int var2 = 4;

	    // 1. 一般常用的方法，别的语言也适用，适用于不仅限于整形，更为通用
        int temp = var1;
        var1 = var2;
        var2 = temp;
        System.out.println("var1:" + var1 + "\t var2:" + var2);// var1:4	 var2:3

        // 2. 使用的比较少，但是也是交换整数变量的一种方式
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.println("var1:" + var1 + "\t var2:" + var2);// var1:3	 var2:4

        // 3. 最为高效的方式，但是只限于整型；
        var1 = var1 ^ var2;
        var2 = var1 ^ var2;
        var1 = var1 ^ var2;
        System.out.println("var1:" + var1 + "\t var2:" + var2); // var1:4	 var2:3

        // 4. pythonic交换，这种golang是可以使用的
//        var1, var2 = var2, var1;
        // 很明显，在Java中这不是一个合法的语句，编译期间尚不能通过。

        /*
        * 总结：1. Java中变量交换的方法有三种，就是上述介绍的；
        * 2. 第一种使用范围更广，且不限于类型，是Java中使用最为广泛的方式；
        * 3. 第二种不做评价，使用条件苛刻，使用范围局限；
        * 4. 第三种虽然效率极高，但是并不通用，有和第二种一样的局限性，但是由于效率极高，我们还是会
        * 在一些对性能要求苛刻的地方使用这种方式交换变量；
        * 5. 第四种Java语法上就不支持，但是其他一些语言还是接收这样的操作的，我觉得这样写挺酷的，可是高斯林可能觉得有些非主流了。
        * */
    }
}
