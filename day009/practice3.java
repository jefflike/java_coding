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
		//this(name);// ����: �޷��ڵ��ó����͹�����֮ǰ����name
		//�ڴ˴�����name����ʱʵ����δ��ɣ�����δ������ɣ�������ʱ��δ��ʼ�������Դ�ʱ���޷�ʹ��name����
		this("С��");
		System.out.println("��ĿҪ��дһ���޲εĹ�����");
	}
	
	Student(String name){
		this.name = name;
	}
	
}

class TestStudent{
	public static void main(String[] args){
		Student a = new Student();
		System.out.print(a.getName());
		Student s = new Student("�ϴ�");
		//s.setName("�϶�");
		System.out.println(s.getName());
	}
}