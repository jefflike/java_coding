import java.util.Scanner;
class deadforloop{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = 0;//记录正数的个数
		int b = 0;//记录负数的个数
		//for(;;){
		while(true){
			System.out.println("请输入一个整数：");
			int num = s.nextInt();
			if(num > 0)
				a++;
			else if(num < 0)
				b++;
			else
				break;	
		}
        System.out.println("正数的个数为：" + a);
		System.out.println("负数的个数为：" + b);
		}
	}
