import java.util.Scanner;

class TestScanner{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入你的姓名:");
		String name = input.next();
		
		System.out.println("请输入你的年龄:");
		int age = input.nextInt();
		
		System.out.println("请输入你的性别:");
		String gender = input.next();
		char mygender = gender.charAt(0);
		
		System.out.println("请输入你的手机号:");
		String tel = input.next();
		
		System.out.println("请输入你的薪资:");
		double money = input.nextDouble();

		System.out.println("是否结婚（true/false）:");
		boolean marry = input.nextBoolean();		
		
		System.out.println("姓名："+name+"\n年龄："+age+"\n性别:"+gender+"\n手机号："+tel+"\n薪资："+money+"\n已婚否："+marry);
	}
}