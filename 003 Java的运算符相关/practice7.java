/*7、赌数游戏：随机产生3个1-6的整数，如果三个数相等，那么称为“豹子”，
如果三个数之和大于9，称为“大”，如果三个数之和小于等于9，称为“小”，
用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否猜对了*/
import java.util.Scanner;
class dice{
	public static void main(String[] args){
		int one = (int)(Math.random()*6 + 1);
		int two = (int)(Math.random()*6 + 1);
		int three = (int)(Math.random()*6 + 1);
		//System.out.println("骰子的数值是：" + one + " " + two + " " + three);
		Scanner input = new Scanner(System.in);
		System.out.print("买定离手：");
		String choice = input.next();
		if(one == two && two == three){
			System.out.println("豹子");
			if("豹子".equals(choice)){
				System.out.println("恭喜您猜对了");
			}else{
				System.out.println("很遗憾您猜错了");
			}
		}else{
			if((one + two + three) <= 9){
				System.out.println("结果是：小");
				if("小".equals(choice)){
				System.out.println("恭喜您猜对了");
				}else{
					System.out.println("很遗憾您猜错了");
				}
			}else if((one + two + three) > 9){
				System.out.println("结果是：大");
				if("大".equals(choice)){
				System.out.println("恭喜您猜对了");
				}else{
					System.out.println("很遗憾您猜错了");
				}
			}
		}
	}
}