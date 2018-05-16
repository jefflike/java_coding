import java.util.Scanner;
class TestWeek{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] myWeek = new String[]{"1","2","3","4","5","6","7"};
		System.out.println("请输入星期数值：");
		int myIndex = input.nextInt();
		if(myIndex>=1 && myIndex <=7){
			System.out.println("您输入的是星期："+myWeek[myIndex-1]);
		}else{
			System.out.println("您输入有误！");
		}
	}
}