/*
����һ��ѧ���ࣺ
�����ԣ����������䡢�绰����ַ�����֤���롢�Ա�
����������˽�л������ṩget/set
�ṩ�޲ι�����вι���
�ṩgetInfo()����������ѧ�������������Ϣ
�ڲ����ഴ��ѧ���������󣬲���ʾѧ����Ϣ
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
		//this(this.name);//����
		System.out.println("��ĿҪ��дһ���޲εĹ�����");
	}
	
	Student(String name){
		this.name = name;
	}
	
	Student(String name, int age, String tel, String addr, String id, char gender){
		this("С��");
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
		Student s = new Student("�ϴ�", 25, "12345678910", "�������ˮ��", "����", '��');
		System.out.println(s.getName()+","+s.getAge()+","+s.getTel()+","+s.getAddr()+","+s.getGender());
		s.setName("�϶�");
		System.out.println(s.getName());
	}
}