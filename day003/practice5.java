/*13����дһ������Ϊһ������������ҳ����Ӧ���й���Ф��
�й�����Ф����12��һ�����ڣ�ÿ����һ���������
rat���󣩡�ox��ţ����tiger��������rabbit���ã���dragon��������snake���ߣ���
      horse������sheep���򣩡�monkey���򣩡�rooster��������dog��������pig������
��ʾ��2017�꣺��   2017 % 12 == 1*/
import java.util.Scanner;
class TestAnimal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = input.nextInt();
		switch(year % 12){
			case 1:
			    System.out.println("��ФΪ��");
				break;
			case 2:
				System.out.println("��ФΪ��");
				break;
			case 3:
				System.out.println("��ФΪ��");
				break;
			case 4:
				System.out.println("��ФΪ��");
				break;
			case 5:
				System.out.println("��ФΪţ");
				break;
			case 6:
				System.out.println("��ФΪ��");
				break;
			case 7:
				System.out.println("��ФΪ��");
				break;
			case 8:
				System.out.println("��ФΪ��");
				break;
			case 9:
				System.out.println("��ФΪ��");
				break;
			case 10:
				System.out.println("��ФΪ��");
				break;
			case 11:
				System.out.println("��ФΪ��");
				break;
			default:
			    System.out.println("��ФΪ��");
				break;
		}
	}
}