/*10����д���򣬴Ӽ��̽�����������.�������Ϊ1-7����ӡ��Ӧ������ֵ�������ӡ���Ƿ���������*/
import java.util.Scanner;
class Week{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�����뵱ǰ���ڣ�");
		int newWeek = input.nextInt();
		switch(newWeek){
			case 1:
			    System.out.println("��ǰ������һ��");
				break;
			case 2:
			    System.out.println("��ǰ�����ڶ���");
				break;
			case 3:
			    System.out.println("��ǰ����������");
				break;
			case 4:
			    System.out.println("��ǰ�������ġ�");
                break;				
			case 5:
			    System.out.println("��ǰ�������塣");
				break;
			case 6:
			    System.out.println("��ǰ����������");
				break;
			case 7:
			    System.out.println("��ǰ�������ա�");
                break;	
			default:
			    System.out.println("�Ƿ�������");				
				}
	}
}