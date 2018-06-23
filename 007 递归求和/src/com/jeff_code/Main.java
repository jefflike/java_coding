/*
* f(n)=n + (n-1) + (n-2) + .... + 1，例如：f(5) = 5 + 4 + 3 + 2 + 1，f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，请用递归的方式完成方法long f( int n)的方法体
* */
package com.jeff_code;

public class Main {

    public static void main(String[] args) {
        System.out.println(f(5));
    }

    static long f( int n){
        if(n == 1){
            return 1;
        }
        return n + f(n-1);
    }
}
