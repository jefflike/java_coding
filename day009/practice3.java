class Student{
	private String name;
	
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}
	
	Student(){
		//this(this.name);
		//this(name);// 错误: 无法在调用超类型构造器之前引用name
		//在此处调用name，此时实例化未完成，对象未创建完成，变量此时还未初始化，所以此时还无法使用name属性
		this("小明");
		System.out.println("题目要求写一个无参的构造器");
	}
	
	Student(String name){
		this.name = name;
	}
	
}

class TestStudent{
	public static void main(String[] args){
		Student a = new Student();
		System.out.print(a.getName());
		Student s = new Student("老大");
		//s.setName("老二");
		System.out.println(s.getName());
	}
}