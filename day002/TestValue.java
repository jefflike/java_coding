import java.util.Scanner;
public class TestValue{
	public static void main(String[] args){
		Scanner myValue = new Scanner(System.in);
		System.out.println("��������ֵ: ");
		int thisValue = myValue.nextInt();
		int hundred = thisValue / 100;
		int ten = thisValue % 100 /10;
		int number = thisValue % 10;
		System.out.println("��λ��: " + hundred);
		System.out.println("ʮλ��: " + ten);
		System.out.println("��λ��: " + number);
	}
}