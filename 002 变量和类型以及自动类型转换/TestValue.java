import java.util.Scanner;
public class TestValue{
	public static void main(String[] args){
		Scanner myValue = new Scanner(System.in);
		System.out.println("请输入数值: ");
		int thisValue = myValue.nextInt();
		int hundred = thisValue / 100;
		int ten = thisValue % 100 /10;
		int number = thisValue % 10;
		System.out.println("百位数: " + hundred);
		System.out.println("十位数: " + ten);
		System.out.println("个位数: " + number);
	}
}