/*
* 请写一个冒泡排序，实现{5,7,3,9,2}从小到大排序
* */
package com.jeff_code;

public class Main {

    public static void main(String[] args) {
	int[] arr = {5,7,3,9,2};

	for (int i=0; i < arr.length-1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    for(int i:arr){
	    System.out.println(i);
    }
    }
}
