import java.util.Scanner;
class Student{
	String name;
	int score;
}

class TestStudentArray{
	public static void main(String[] args){
		Student[] students = new Student[5];
		Scanner input = new Scanner(System.in);
		
		//forѭ������ѧ������Ϣ
		for(int i =0; i<students.length; i++){
			students[i] = new Student();
			System.out.print("�������"+ (i+1)+"��ͬѧ��������");
			students[i].name = input.next();
			System.out.print("�������"+ (i+1)+"��ͬѧ�ĳɼ���");
			students[i].score = input.nextInt();
		}
		
		for(Student s : students){
			System.out.println(s.name +"�ĳɼ��ǣ�"+s.score);
		}
	
		
		//ð������ֻ��ʾ�ɼ�
		System.out.println("�ɼ��Ӹߵ����ǣ�");
		for(int i=0; i<students.length-1; i++){//�ȽϵĴ���
		    //ÿ����Сֵ����������
		    int minIndex = i;
			for(int j=i; j<students.length; j++){
				if(students[j].score<students[minIndex].score){
					Student temp = students[j];
					students[j] = students[minIndex];
					students[minIndex] = temp;
				}
			}
		}
		
		//�ٴδ�ӡ
		for(Student s : students){
			System.out.println(s.name +"�ĳɼ��ǣ�"+s.score);
		}
		
	}
}