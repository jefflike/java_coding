package com.atguigu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = new int[]{23, 123, 12, 2, 6, 8};
        String[] arr1 = new String[]{"233", "3", "112", "9", "16", "81"};
        int[] arr2 = new int[arr.length];
        arr2 = Arrays.copyOf(arr, arr.length);
        String[] arr3 = new String[arr1.length];
        arr3 = Arrays.copyOf(arr1, arr1.length);
//        Arrays.sort(arr);
//        Arrays.parallelSort(arr);
//        int a = Arrays.binarySearch(arr, 12);
//        System.out.println(a);
        System.out.println(true);// [2, 6, 8, 12, 23, 123]
        System.out.println(arr.equals(arr1));// false
        System.out.println(arr.equals(arr2));// false 此处比较的是两个的对象的equals，比较的是==
//        System.out.println(Arrays.equals(arr, arr1));// 没有重载两个不同类型的equals方法
        System.out.println(Arrays.equals(arr, arr2));// true
        System.out.println(Arrays.equals(arr1, arr3));// true

        int[] arr4 = new int[10];
        arr4[0] = 1;
        arr4[1] = 2;
        arr4[2] = 3;
        arr4[3] = 4;
        Arrays.fill(arr4, 4, 9, 5);
        System.out.println(Arrays.toString(arr4));//[1, 2, 3, 4, 5, 5, 5, 5, 5, 0]

        int[] arr5 = new int[]{1, 2, 3, 4, 5};
        int[] arr6 = Arrays.copyOfRange(arr5, 0, 4);
        System.out.println(Arrays.toString(arr6));// [1, 2, 3, 4]
    }
}
