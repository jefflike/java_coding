class Student{
	String name;
	int age;
}

class TestStudent{
	public static void main(String[] args){
		Student[] student = new Student[3];
		
		student[0] = new Student();
		student[0].name = "老大";
		student[0].age = 12;
		
		student[1] = new Student();
		student[1].name = "老二";
		student[1].age = 13;
		
		student[2] = new Student();
		student[2].name = "老三";
		student[2].age = 14;
		
		for(Student s : student){
			System.out.println("名字是：" + s.name);
			student[0].age = 31;
		}
		
		for(Student s : student){
			System.out.println("年龄是：" + s.age);
		}
	}
}