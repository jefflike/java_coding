package com.atguigu;

public enum Status {
    FREE{
        @Override
        public String toString() {
            return "如果是空闲，打印这是一个新员工，得赶紧安排任务...";
        }
    },
    BUSY{
        @Override
        public String toString() {
            return "如果是忙，打印这是一个好员工，现在正忙...";
        }
    },
    VOCATION{
        @Override
        public String toString() {
            return "如果是休假，打印这个员工正在休假，无法安排任务...";
        }
    },
    LEFT{
        @Override
        public String toString() {
            return "如果是离职，打印这个员工已经离职，应该删除他的信息...";
        }
    }
}
