/*
* 求1+2！+3！+...+20！的和
*
* */
package com.jeff_code;

public class Main {

    public static void main(String[] args) {

        new Main().sum();
    }

    void sum(){
        // 返回值过大，需要改为long类型来存放
        long sum = 0L;
        for (int i=1; i<=20; i++){
            sum += JieCheng(i);
        }
        System.out.println(sum);
    }

    long JieCheng(int a){
        if(a == 1){
            return 1;
        }
        return a*JieCheng(a-1);
    }
}
