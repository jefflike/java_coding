class Student{
	String name;
	
	{
		name = "�ϴ�";
	}
	
	Student(){
		//System.out.println(name);//�ϴ�
	    // this(name);//�����ᱨ��
		this("�ϴ�");//�������гɹ�
		//System.out.println("��ĿҪ��дһ���޲εĹ�����");
	}
	
	Student(String name){
		this.name = name;
	}
	
}
class TestStudent{
	public static void main(String[] args){
		Student stu1 = new Student();
		System.out.print(stu1.name);
		//Student stu2 = new Student("�ϴ�");
		//System.out.println(stu2.getName());
	}
}