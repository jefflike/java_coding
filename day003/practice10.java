/*10、编写程序，从键盘接收整数参数.如果该数为1-7，打印对应的星期值，否则打印“非法参数”。*/
import java.util.Scanner;
class Week{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入当前星期：");
		int newWeek = input.nextInt();
		switch(newWeek){
			case 1:
			    System.out.println("当前是星期一。");
				break;
			case 2:
			    System.out.println("当前是星期二。");
				break;
			case 3:
			    System.out.println("当前是星期三。");
				break;
			case 4:
			    System.out.println("当前是星期四。");
                break;				
			case 5:
			    System.out.println("当前是星期五。");
				break;
			case 6:
			    System.out.println("当前是星期六。");
				break;
			case 7:
			    System.out.println("当前是星期日。");
                break;	
			default:
			    System.out.println("非法参数。");				
				}
	}
}