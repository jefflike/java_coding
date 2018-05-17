import java.util.Scanner;
class Student{
	String name;
	int score;
}

class TestStudentArray{
	public static void main(String[] args){
		Student[] students = new Student[5];
		Scanner input = new Scanner(System.in);
		
		//for循环输入学生的信息
		for(int i =0; i<students.length; i++){
			students[i] = new Student();
			System.out.print("请输入第"+ (i+1)+"个同学的姓名：");
			students[i].name = input.next();
			System.out.print("请输入第"+ (i+1)+"个同学的成绩：");
			students[i].score = input.nextInt();
		}
		
		for(Student s : students){
			System.out.println(s.name +"的成绩是："+s.score);
		}
	
		
		//冒泡排序只显示成绩
		System.out.println("成绩从高到低是：");
		for(int i=0; i<students.length-1; i++){//比较的次数
		    //每列最小值的数的索引
		    int minIndex = i;
			for(int j=i; j<students.length; j++){
				if(students[j].score<students[minIndex].score){
					Student temp = students[j];
					students[j] = students[minIndex];
					students[minIndex] = temp;
				}
			}
		}
		
		//再次打印
		for(Student s : students){
			System.out.println(s.name +"的成绩是："+s.score);
		}
		
	}
}