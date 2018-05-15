/*2、岳小鹏参加Java考试，他和父亲岳不群达成承诺：如果：
成绩为100分时，奖励一辆BMW；
成绩为(80，99]时，奖励一台iphone7plus；
当成绩为[60,80]时，奖励一个 iPad；
其它时，什么奖励也没有。
请从键盘输入岳小鹏的期末成绩，并加以判断*/
import java.util.Scanner;
class TestGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入岳晓鹏的期末成绩：");
		int score = input.nextInt();
		if(score >= 0 && score <= 100){
			if(score == 100){
				System.out.println("奖励一台宝马");
			}else if(score >80){
				System.out.println("奖励一个iphone7plus");
			}else if(score>=60){
				System.out.println("奖励一个ipad");
			}else{
				System.out.println("什么都没有");
			}
		}else{
			System.out.println("输入成绩有误，请重新输入");
		}
	}
}