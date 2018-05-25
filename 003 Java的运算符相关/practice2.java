/*3、编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else),并且从大到小输出。*/
import java.util.Scanner;
class TestSort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个变量：");
		int num1 = input.nextInt();
		System.out.print("请输入第二个变量：");
		int num2 = input.nextInt();
		System.out.print("请输入第三个变量：");
		int num3 = input.nextInt();
        if(num1>=num2){
			if(num1>=num3){
				if(num2>=num3){
					System.out.println("num1>=num2>=num3:"+num1+">="+num2+">="+num3);
				}else if(num2<num3){
					System.out.println("num1>=num3>=num2:"+num1+">="+num3+">="+num2);
				}
			}else if(num1<num3){
				System.out.println("num3>=num1>=num2:"+num3+">="+num1+">="+num2);
			}
		}else if(num1<num2){
			if(num1>=num3){
				System.out.println("num2>=num1>=num3:"+num2+">="+num1+">="+num3);
			}else if(num1<num3){
				if(num2>=num3){
					System.out.println("num2>=num3>=num1:"+num2+">="+num3+">="+num1);
				}else if(num2<num3){
					System.out.println("num3>=num2>=num1:"+num3+">="+num2+">="+num1);
				}
				
			}
		}		
	}
}