/*8��ʹ�� switch ��Сд���͵� char�� a, b, c, dתΪ��д��
�Ѱ��������ֵ�char��1,2,3,4תΪ��Ҽ���������������������Ķ���� ��other����*/
import java.util.Scanner;
class partExchange{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������Ҫת����ֵ��");
		String write = input.next();
		char word = write.charAt(0);
		switch(word){
			case 'a':
			    System.out.println('A');
				break;
			case 'b':
			    System.out.println('B');	
				break;
			case 'c':
			    System.out.println('C');
				break;
			case 'd':
			    System.out.println('D');
				break;
			case '1':
			    System.out.println('Ҽ');
				break;
			case '2':
			    System.out.println('��');
				break;
			case '3':
			    System.out.println('��');
				break;
			case '4':
			    System.out.println('��');
                break;	 	
            default:
			    System.out.println("other");
                break;	 	
		}
	}
}