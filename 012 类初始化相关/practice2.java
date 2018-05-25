class Student{
	String name;
	
	{
		name = "老大";
	}
	
	Student(){
		//System.out.println(name);//老大
	    // this(name);//这样会报错
		this("老大");//这样运行成功
		//System.out.println("题目要求写一个无参的构造器");
	}
	
	Student(String name){
		this.name = name;
	}
	
}
class TestStudent{
	public static void main(String[] args){
		Student stu1 = new Student();
		System.out.print(stu1.name);
		//Student stu2 = new Student("老大");
		//System.out.println(stu2.getName());
	}
}