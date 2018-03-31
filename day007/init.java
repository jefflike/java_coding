package day007;

public class init {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.getName() + ":" + p1.getAge());
		String str = new String("hello");
		System.out.println(str);
		
		Person p2 = new Person("jeff");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		Person p3 = new Person("frank",23);
		System.out.println("name:" + p3.getName() + " age:" + p3.getAge());
		//体会属性赋值的过程
		Person p4 = new Person();
		System.out.println("name:" + p4.getName() + " age:" + p4.getAge());
		
		Person p5 = new Person(12);
		System.out.println("name:" + p5.getName() + " age:" + p5.getAge());
	}
}
class Person{
	//属性
	private String name;
	private int age = 1;
	
	//构造器
	public Person(String n){
		name = n;
	}
	public Person(){
//		age = 10;
//		name = "张三";
	}
	public Person(int a){
		age = a;
	}
	public Person(String n,int a){
		name = n;
		age = a;
	}
	
	//方法
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}