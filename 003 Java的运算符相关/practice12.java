/*12、从键盘分别输入年、月、日，判断这一天是当年的第几天 
   注：判断一年是否是闰年的标准：
       1）可以被4整除，但不可被100整除
       2）可以被400整除*/
import java.util.Scanner;
class MyDay{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = input.nextInt();
		System.out.print("请输入月份：");
		int month = input.nextInt();
		System.out.print("请输入当月几日：");
		int day = input.nextInt();
		
		// 判断是否闰年
		if(year % 400 == 0){
			System.out.print("闰年");
		}else if(year % 4 == 0 && year % 100 != 0){
			System.out.print("闰年");
		}else{
			System.out.print("不是闰年");
		}
	}
}