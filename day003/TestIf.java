import java.util.Scanner;
public class TestIf{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������������䣺");
		int age = input.nextInt();
		if(age >= 18){
			System.out.println("�ѳ��꣬�����ȥ�ܶ�ط�");
		}else{
			System.out.println("δ���꣬�ڼҴ��š�");
		}
	}
}