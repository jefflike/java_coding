/*4、大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，
当然要提出一定的条件：高：180cm以上；富：财富1千万以上；帅：是。
如果这三个条件同时满足，则：“我一定要嫁给他!!!”
如果三个条件中有为真的情况，则：“嫁吧，比上不足，比下有余。”
如果三个条件都不满足，则：“不嫁！”
提示：从键盘输入
Scanner input=new Scanner(System.in);
input.nextInt();//接收从键盘输入的一个整数
input.next();输入一个字符串
input.nextDouble();//输入一个小数
input.nextBoolean();//输入一个布尔值

例如：
System.out.println(“身高:(cm)”);
input.nextInt();
System.out.println(“财富:(千万)”);
input.nextDouble();
System.out.println(“帅否:(true/false)”);   (是/否)
input.nextBoolean();   或者   input.next();   “是”.equals(str)*/
import java.util.Scanner;
class TestMarry{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("身高:(cm)");
        int height = input.nextInt();
		
		System.out.print("财富:(千万)");
        double money = input.nextDouble();
		
		System.out.println("帅否:(true/false)");
        boolean looklike = input.nextBoolean();
		
		if(height >= 180 && money >= 1 && looklike == true){
			System.out.println("我一定要嫁给他!!!");
		}else if(height >= 180 || money >= 1 || looklike == true){
			System.out.println("嫁吧，比上不足，比下有余。");
		}else{
			System.out.println("不嫁");
		}
	}
}