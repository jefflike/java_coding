/*9����������ָ���·ݣ���ӡ���·������ļ��ڡ�
3,4,5 ���� 6,7,8 �ļ�  9,10,11 �＾ 12, 1, 2 ����*/
import java.util.Scanner;
class Season{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = input.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("�����Ǵ���");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("����������");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("����������");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("�����Ƕ���");
				break;
			default:
			    System.out.println("��������·�����������1-12������");
			}
	}
}