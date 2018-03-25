/**
 我的第一个java程序
 这是java特有的文档注释
 *@author jeffd
 *@version 1.0
 * */
public class myhello{
        //1.源文件以.java结尾
	//2.源文件可以有多个class声明的类
	//3.类中可以有主方法（即main方法）其格式是固定的。  
	//4.main方法，它是程序的入口，方法内是程序的执行部分
	//5.一个源文件只能有一个声明public的类，同时要求此类的类名与源文件名一致
	//6.每个语句都以分号结束
	//7.执行程序：javac进行编译生成多个.class字节码文件，java运行
	//8.多行注释不能嵌套
	public static void main(String[] args){
		//这是程序的输出
		System.out.print("Hello World!");
		//有ln的print换行，没有的不换行
		System.out.println("Hello World!");
	}
}
