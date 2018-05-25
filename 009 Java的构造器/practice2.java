/*
声明一个学生类：
有属性：姓名、年龄、电话、地址、身份证号码、性别
给所有属性私有化，并提供get/set
提供无参构造和有参构造
提供getInfo()方法，返回学生对象的所有信息
在测试类创建学生两个对象，并显示学生信息
*/
class Student{
	private String name;
	private int age;
	private String tel;
	private String addr;
	private String id;
	private char gender;
	
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	
	void setAge(int age){
		this.age = age;
	}
	int getAge(){
		return age;
	}
	
	void setTel(String tel){
		this.tel = tel;
	}
	String getTel(){
		return tel;
	}
	
	void setAddr(String addr){
		this.addr = addr;
	}
	String getAddr(){
		return addr;
	}
	
	void setId(String id){
		this.id = id;
	}
	String getId(){
		return id;
	}
	
	void setGender(char gender){
		this.gender = gender;
	}
	char getGender(){
		return gender;
	}
	
	Student(){
		//this(this.name);//报错
		System.out.println("题目要求写一个无参的构造器");
	}
	
	Student(String name){
		this.name = name;
	}
	
	Student(String name, int age, String tel, String addr, String id, char gender){
		this("小明");
		//this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
		this.id = id;
		this.gender = gender;
	}
}

class TestStudent{
	public static void main(String[] args){
		Student a = new Student();
		System.out.print(a.getName());
		Student s = new Student("老大", 25, "12345678910", "莲花乡池水沟", "保密", '男');
		System.out.println(s.getName()+","+s.getAge()+","+s.getTel()+","+s.getAddr()+","+s.getGender());
		s.setName("老二");
		System.out.println(s.getName());
	}
}