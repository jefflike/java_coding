import java.util.Scanner;
class GroupStudentName{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������������");
		int amount = input.nextInt();
		String[] names = new String[amount];
		for(int i=0; i<names.length; i++){
			String name = input.next();
			names[i] = name;
		}
		
		for(int i=0; i<names.length; i++){
			System.out.println("�����"+(i+1)+"��ͬѧ��"+names[i]);
		}
	}
}