package com.atguigu;

public class Main {

    public static void main(String[] args) {
        // 创建一个内存特别大的数组，此时数组所占内存的长度就大于内存会报超出内存的错误
        // Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
//        int[] arr = new int[Integer.MAX_VALUE];

        // Exception in thread "main" java.lang.StackOverflowError
        test();
    }

    public static void test(){
        test();
    }
}
