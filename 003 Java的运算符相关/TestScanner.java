import java.util.Scanner;

class TestScanner{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("�������������:");
		String name = input.next();
		
		System.out.println("�������������:");
		int age = input.nextInt();
		
		System.out.println("����������Ա�:");
		String gender = input.next();
		char mygender = gender.charAt(0);
		
		System.out.println("����������ֻ���:");
		String tel = input.next();
		
		System.out.println("���������н��:");
		double money = input.nextDouble();

		System.out.println("�Ƿ��飨true/false��:");
		boolean marry = input.nextBoolean();		
		
		System.out.println("������"+name+"\n���䣺"+age+"\n�Ա�:"+gender+"\n�ֻ��ţ�"+tel+"\nн�ʣ�"+money+"\n�ѻ��"+marry);
	}
}