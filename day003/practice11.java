/*11����д���򣺴Ӽ����϶���һ��ѧ���ɼ�������ڱ���score�У�
����score��ֵ������Ӧ�ĳɼ��ȼ���
score>=90           �ȼ���A
70=<score<90        �ȼ���B
60=<score<70        �ȼ���C
score<60            �ȼ���D*/
import java.util.Scanner;
class MyScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������ѧ���ɼ���");
		int score = input.nextInt();
		if(score >= 0 && score <= 100){
			if(score >= 90){
				System.out.println("A");
			}else if(score >= 70){
				System.out.println("B");
			}else if(score >= 60){
				System.out.println("C");
			}else if(score < 60){
				System.out.println("D");
			}
		}else{
			System.out.println("��д������������ȷ�ķ�����");
		}

	}
}