package com.atguigu;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
	String str = "jefflike";
	System.out.println(str.length());// 8
	System.out.println(str.isEmpty());// false
	System.out.println(str.equals("jefflike"));// true
	System.out.println(str == "jefflike");// true
	System.out.println(str.toUpperCase());// JEFFLIKE
	System.out.println(str.toLowerCase());// jefflike
	System.out.println(("   \t    "+ str + "  \n  ").trim());// jefflike
    System.out.println(str.concat(" pretty"));// jefflike pretty
    System.out.println(str + " good");// jefflike good
    char[] a = str.toCharArray();
    System.out.println(a);// jefflike
    System.out.println(str.charAt(2));// f
    System.out.println(str.endsWith("e"));// true
    System.out.println(str.startsWith("jeff"));// true
    System.out.println(str.indexOf("ef"));// 1
    System.out.println(str.contains("ef"));// true
    System.out.println(str.lastIndexOf("e"));// 7
    System.out.println(str.substring(0, str.lastIndexOf("e")));// jefflik
    System.out.println(str.substring(str.lastIndexOf("e")));// e
    byte[] b = str.getBytes();
    System.out.println(Arrays.toString(b));// [106, 101, 102, 102, 108, 105, 107, 101]
    byte[] c = str.getBytes("UTF-8");
    System.out.println(Arrays.toString(c));// [106, 101, 102, 102, 108, 105, 107, 101]
    System.out.println(new String(b));// 按平台的转码又转回来了jefflike
    System.out.println(str.matches("\\w+"));//true
    System.out.println(str.replace("e", "a"));//jafflika
    System.out.println(str.replaceAll("[e|l]", "ae"));//jaeffaeikae
    System.out.println(str.replaceFirst("[e|l]", "ae"));//jaefflike
    String[] strings = str.split("[e|l]");
    for (String string : strings) {
        System.out.println(string);
    }
    /*
j
ff
ik
*/
    }
}
