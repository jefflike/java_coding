/*3����д�����ɼ����������������ֱ�������num1��num2��num3��
�����ǽ�������(ʹ�� if-else if-else),���ҴӴ�С�����*/
import java.util.Scanner;
class TestSort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ��������");
		int num1 = input.nextInt();
		System.out.print("������ڶ���������");
		int num2 = input.nextInt();
		System.out.print("�����������������");
		int num3 = input.nextInt();
        if(num1>=num2){
			if(num1>=num3){
				if(num2>=num3){
					System.out.println("num1>=num2>=num3:"+num1+">="+num2+">="+num3);
				}else if(num2<num3){
					System.out.println("num1>=num3>=num2:"+num1+">="+num3+">="+num2);
				}
			}else if(num1<num3){
				System.out.println("num3>=num1>=num2:"+num3+">="+num1+">="+num2);
			}
		}else if(num1<num2){
			if(num1>=num3){
				System.out.println("num2>=num1>=num3:"+num2+">="+num1+">="+num3);
			}else if(num1<num3){
				if(num2>=num3){
					System.out.println("num2>=num3>=num1:"+num2+">="+num3+">="+num1);
				}else if(num2<num3){
					System.out.println("num3>=num2>=num1:"+num3+">="+num2+">="+num1);
				}
				
			}
		}		
	}
}