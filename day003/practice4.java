/*5����ax2+bx+c=0���̵ĸ���a,b,c�ֱ�Ϊ�����Ĳ�����
���a��0����ô��
��1����b2-4ac>0�����������⣻
��2����b2-4ac=0������һ���⣻
��3����b2-4ac<0�����޽⣻
���a=0,b��0����ô��

��ʾ1��Math.sqrt(num);  sqrtָƽ����
���磺
��x2-4x+1=0���̵ĸ�
��x2-2x+1=0���̵ĸ�*/
import java.util.Scanner;
class TestMath{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������a��ֵ��");
		int a = input.nextInt();
		System.out.print("������b��ֵ��");
		int b = input.nextInt();
		System.out.print("������c��ֵ��");
		int c = input.nextInt();	
        
        if(a != 0){
			if(((b*b - 4*a*c) > 0)){
				double answer1 = (-b+Math.sqrt(b*b - 4*a*c)) / (2 * a);
				double answer2 = (-b-Math.sqrt(b*b - 4*a*c)) / (2 * a);
				System.out.println("���̽�Ϊ"+answer1+"��"+answer2);
			}else if(((b*b - 4*a*c) == 0)){
				double answer3 = -(b / (2*a));
				System.out.println("����Ψһ��Ϊ"+answer3);
			}else{
				System.out.println("�����޽�");
				
			}
		}else if(a==0 && b != 0){
			double answer4 = -c / b;
			System.out.println("���̽�Ϊ"+answer4);
		}		
	}
}