/*2����С���μ�Java���ԣ����͸�������Ⱥ��ɳ�ŵ�������
�ɼ�Ϊ100��ʱ������һ��BMW��
�ɼ�Ϊ(80��99]ʱ������һ̨iphone7plus��
���ɼ�Ϊ[60,80]ʱ������һ�� iPad��
����ʱ��ʲô����Ҳû�С�
��Ӽ���������С������ĩ�ɼ����������ж�*/
import java.util.Scanner;
class TestGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("����������������ĩ�ɼ���");
		int score = input.nextInt();
		if(score >= 0 && score <= 100){
			if(score == 100){
				System.out.println("����һ̨����");
			}else if(score >80){
				System.out.println("����һ��iphone7plus");
			}else if(score>=60){
				System.out.println("����һ��ipad");
			}else{
				System.out.println("ʲô��û��");
			}
		}else{
			System.out.println("����ɼ���������������");
		}
	}
}