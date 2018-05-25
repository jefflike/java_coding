/*11、编写程序：从键盘上读入一个学生成绩，存放在变量score中，
根据score的值输出其对应的成绩等级：
score>=90           等级：A
70=<score<90        等级：B
60=<score<70        等级：C
score<60            等级：D*/
import java.util.Scanner;
class MyScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生成绩：");
		int score = input.nextInt();
		if(score >= 0 && score <= 100){
			if(score >= 90){
				System.out.println("A");
			}else if(score >= 70){
				System.out.println("B");
			}else if(score >= 60){
				System.out.println("C");
			}else if(score < 60){
				System.out.println("D");
			}
		}else{
			System.out.println("填写错误，请输入正确的分数。");
		}

	}
}