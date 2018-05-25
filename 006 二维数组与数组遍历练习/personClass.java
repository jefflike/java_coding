package day006;


/*
 * 1.面向对象的编程关注于类的设计
 * 2.设计类实际上就是设计类的成员
 * 3.基本的类的成员：属性（成员变量或Field）  & 方法（Method）
 */
public class personClass {

	public static void main(String[] args) {
		// 实例化一个人
		person man = new person();
		man.name = "jeff";
		man.age = 111;
		man.sex = true;
		man.info();
		
		man.setName("frank");
		man.info();
	}

}

//设计一个人的类
class person{
	//1.属性
	String name;
	int age;
	boolean sex;
	
	//2.方法
	public void eat(){
		System.out.println("eat some food");
	}
	
	public void sleep(){
		System.out.println("sleep");
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
		
	public void info(){
		System.out.println(name+"\tis\t"+age+"\tand\t"+sex);
	}
	
}
