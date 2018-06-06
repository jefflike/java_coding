package com.atguigu;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class TestDefineAnnotation2 {

    public static void main(String[] args) {
        //3、读取注解
        Class<YourClass> c = YourClass.class;
        YourAnnotation y = c.getAnnotation(YourAnnotation.class);
        String value = y.value();
        System.out.println(value);

        Class<OtherClass> c2 = OtherClass.class;
        YourAnnotation y2 = c2.getAnnotation(YourAnnotation.class);
        String value2 = y2.value();
        System.out.println(value2);
    }

}
//2、使用

@YourAnnotation("dingjie")
class YourClass{

}

//这里因为@YourAnnotation的配置参数有默认值，可以不赋值
@YourAnnotation
class OtherClass{

}

//1、声明
@Retention(RetentionPolicy.RUNTIME)
@interface YourAnnotation{
    String value() default "jefflike";
}
