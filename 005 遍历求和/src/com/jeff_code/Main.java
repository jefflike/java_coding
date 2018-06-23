/*
* 用循环控制语句打印输出：1+3+5+...+99=?的结果
* */
package com.jeff_code;

public class Main {

    public static void main(String[] args) {
	// 非常的简单
        int sum = 0;
        for(int i = 0; i<100; i++){
            if(i % 2 == 0)
                continue;
            sum+=i;
        }
        System.out.println(sum);
    }
}
