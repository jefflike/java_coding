/*
* 实现一个Java的数组，这里指的是集合的一种，即是实现一个List，具体包括存储的长度，扩容，当前容量，增删改查等功能
* */
package com.jeff_code;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

}

class MyArray{
    // 底层容器是Java数组,初始长度为10
    private Object[] arr = new Object[10];

    // 记录实际存储的长度
    private int size;

    // 添加对象
    public void add(Object o){
        // 考虑扩容问题
        if(size == arr.length){
            arr = Arrays.copyOf(arr,arr.length*2);
        }
        arr[size++] = o;

    }

    public int size(){
        return size;
    }

    public Object[] all(){

//        return arr;// 不能直接返回arr，引用类型会被外界修改
        return Arrays.copyOf(arr, size);
    }

    public int cap(){
        return arr.length;
    }

    public Object get(int index){
        return arr[index];
    }

    public void set(int index, Object value){
        arr[index] = value;
    }

    public void remove(int index){
        System.arraycopy(arr, index+1, arr, index, size-index-1);
		/*total--;
		array[total] = null;//使得array[total]位置的对象，变成垃圾对象，尽快被回收
*/
        arr[--size] = null;
    }

}

