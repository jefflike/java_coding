/*6���������뿪��һ�����Ʊ����Ϸ����������ز���һ����λ���Ĳ�Ʊ��
��ʾ�û�����һ����λ����Ȼ��������Ĺ����ж��û��Ƿ���Ӯ��
1)����û��������ƥ���Ʊ��ʵ��˳�򣬽���10 000��Ԫ��
2)����û��������������ƥ���Ʊ���������֣���˳��һ�£����� 3 000��Ԫ��
3)����û������һ�����ֽ�����˳�������ƥ���Ʊ��һ�����֣�����1 000��Ԫ��
4)����û������һ�����ֽ������˳�������ƥ���Ʊ��һ�����֣�����500��Ԫ��
5)����û����������û��ƥ���κ�һ�����֣����Ʊ���ϡ�
��ʾ��ʹ��Math.random() ���������
Math.random() ����[0,1)��Χ�����ֵ
Math.random() * 90��[0,90) 
Math.random() * 90 + 10��[10,100) ���õ�  [10,99]
ʹ��(int)(Math.random() * 90  + 10)����һ����λ�����������*/
import java.util.Scanner;
class Ticket{
	public static void main(String[] args){
		int newrandom = (int)(Math.random() * 90  + 10);
		//System.out.println("�н����룺"+ newrandom);
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ���������Ʊ��Ϸ��");
		int choice = input.nextInt();
		if(choice == newrandom){
			System.out.println("��ϲ����ý���10 000��Ԫ");
		}else if(choice % 10 == newrandom / 10 && choice / 10 == newrandom % 10){
			System.out.println("��ϲ����ý���3 000��Ԫ");
		}else if(choice / 10 == newrandom / 10 || choice % 10 == newrandom % 10){
			System.out.println("��ϲ����ý���1 000��Ԫ");
		}else if(choice % 10 == newrandom / 10 || choice / 10 == newrandom % 10){
			System.out.println("��ϲ����ý���500��Ԫ");
		}else{
			System.out.println("��һ����н��ˣ��ٽ�������");
		}
	}
}