/*12���Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ��� 
   ע���ж�һ���Ƿ�������ı�׼��
       1�����Ա�4�����������ɱ�100����
       2�����Ա�400����*/
import java.util.Scanner;
class MyDay{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = input.nextInt();
		System.out.print("�������·ݣ�");
		int month = input.nextInt();
		System.out.print("�����뵱�¼��գ�");
		int day = input.nextInt();
		
		// �ж��Ƿ�����
		if(year % 400 == 0){
			System.out.print("����");
		}else if(year % 4 == 0 && year % 100 != 0){
			System.out.print("����");
		}else{
			System.out.print("��������");
		}
	}
}