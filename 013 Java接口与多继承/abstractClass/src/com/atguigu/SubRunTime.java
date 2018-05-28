package com.atguigu;

public class SubRunTime extends RunTime {
    public void RunCoding(){
        long sum = 0;
        for(int i =0; i<100000000; i++){
            sum += i;
        }
    }
}
