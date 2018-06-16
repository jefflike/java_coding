package com.atguigu;

public class Main {

    public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("xixifast");
	sb.append(" very").append(" sb");
	System.out.println(sb);// xixifast very sb

	sb.insert(8, " very");
	System.out.println(sb);//xixifast very very sb

	sb.delete(8, 22);
	System.out.println(sb);//xixifast

	sb.reverse();
	System.out.println(sb);// tsafixix
    }
}
