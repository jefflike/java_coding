import java.util.Scanner;
class TestArray1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum = 0;
		int maxScore = 0;
		int[] scores;
		System.out.print("请输入组别的人数：");
		scores = new int[input.nextInt()];
		for(int i = 0; i < scores.length; i++){
			System.out.print("请输入第"+(i + 1)+"一个同学的成绩：");
			scores[i] = input.nextInt();
			if(scores[i] <0 || scores[i] >100){
				System.out.println("您输入有误！");
				break;
			}
			maxScore = scores[i] > maxScore ? scores[i] : maxScore;
			sum += scores[i];
		}
		System.out.println("平均分是：" + (sum / scores.length));
		System.out.println("最高分是：" + maxScore);
	}
}