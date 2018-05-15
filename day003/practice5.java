/*13、编写一个程序，为一个给定的年份找出其对应的中国生肖。
中国的生肖基于12年一个周期，每年用一个动物代表：
rat（鼠）、ox（牛）、tiger（虎）、rabbit（兔）、dragon（龙）、snake（蛇）、
      horse（马）、sheep（羊）、monkey（候）、rooster（鸡）、dog（狗）、pig（猪）。
提示：2017年：鸡   2017 % 12 == 1*/
import java.util.Scanner;
class TestAnimal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = input.nextInt();
		switch(year % 12){
			case 1:
			    System.out.println("生肖为鸡");
				break;
			case 2:
				System.out.println("生肖为狗");
				break;
			case 3:
				System.out.println("生肖为猪");
				break;
			case 4:
				System.out.println("生肖为鼠");
				break;
			case 5:
				System.out.println("生肖为牛");
				break;
			case 6:
				System.out.println("生肖为虎");
				break;
			case 7:
				System.out.println("生肖为兔");
				break;
			case 8:
				System.out.println("生肖为龙");
				break;
			case 9:
				System.out.println("生肖为蛇");
				break;
			case 10:
				System.out.println("生肖为马");
				break;
			case 11:
				System.out.println("生肖为羊");
				break;
			default:
			    System.out.println("生肖为猴");
				break;
		}
	}
}