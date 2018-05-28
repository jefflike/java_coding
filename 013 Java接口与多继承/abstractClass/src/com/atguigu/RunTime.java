package com.atguigu;

abstract class RunTime {

    public final long getTime(){
        long startTime = System.currentTimeMillis();

        RunCoding();

        long stopTime = System.currentTimeMillis();

        return stopTime - startTime;


    }

    protected abstract void RunCoding();
}
