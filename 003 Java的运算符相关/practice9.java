/*9、根据用于指定月份，打印该月份所属的季节。
3,4,5 春季 6,7,8 夏季  9,10,11 秋季 12, 1, 2 冬季*/
import java.util.Scanner;
class Season{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入月份：");
		int month = input.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("该月是春天");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("该月是夏天");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("该月是秋天");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("该月是冬天");
				break;
			default:
			    System.out.println("您输入的月份有误，请输入1-12的整数");
			}
	}
}