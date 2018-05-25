import java.util.Scanner;
public class TestIf{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的年龄：");
		int age = input.nextInt();
		if(age >= 18){
			System.out.println("已成年，你可以去很多地方");
		}else{
			System.out.println("未成年，在家呆着。");
		}
	}
}