import java.util.Scanner;
class TestScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的成绩：");
		int score = input.nextInt();
		if(score >=0 && score <= 100){
			if(score >= 60){
				System.out.println("合格");
			}else{
				System.out.println("不合格");
			}
		}else{
			System.out.println("输入有误，不在范围内");
		}
	}
}