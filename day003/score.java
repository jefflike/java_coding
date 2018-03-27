import java.util.Scanner;
class score{
	public static void main(String[] args){
		//创建一个scanner对象，用于键入数字
		Scanner uscore = new Scanner(System.in);
		System.out.println("请输入考试成绩");
		//调用此对象相应方法，完成键盘输入的值的获取
		//next（）：表示从键盘获取一个字符串,int表示键入的是整型数值用于比较
		int str = uscore.nextInt();

		System.out.println("你的成绩是"+str);

		if(str > 100 || str < 0){
			System.out.println("你输入的成绩有误");
		}
		else{
			if(str == 100){
				System.out.println("第一名");
			}else if(str > 80 && str<=99){
				System.out.println("优秀");
			}else if(str >=60 && str<= 80){
				System.out.println("一般");
			}else{
				System.out.println("要加油啊");
			}
		}
	}
}
