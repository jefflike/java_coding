package day005;

import java.util.Scanner;
public class students_scores {

	public static void main(String[] args) {
		// 创建scanner对象，键入学生个数
		Scanner s = new Scanner(System.in);
		System.out.println("student人数");
		int count = s.nextInt();//count用来计数
		//根据键入人数创建数组
		int[] scores = new int[count];
		int maxScore = scores[0];
		//一次键入学生成绩，赋给相应数组元素，并获取最高分
		System.out.println("请输入第" + count + "个成绩：");
        for(int i=0; i<scores.length;i++){
        	int score = s.nextInt();
        	scores[i] = score;
        	if(scores[i]>maxScore){
        		maxScore = scores[i];
        	}
        }
		//4.遍历学生成绩的数组，并根据学生成绩与最高分的差值，赋予相应的等级，并输出
		System.out.println("最高分为：" + maxScore);
		for(int i = 0;i < scores.length;i++){
			char level;
			if(scores[i] >= maxScore - 10){
				level = 'A';
			}else if(scores[i] >= maxScore - 20){
				level = 'B';
			}else if(scores[i] >= maxScore - 30){
				level = 'C';
			}else{
				level = 'D';
			}
			
			System.out.println("student " + i + " score is " + scores[i] + " grade is " + level);
        
	}

}
}
