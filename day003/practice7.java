/*7��������Ϸ���������3��1-6�������������������ȣ���ô��Ϊ�����ӡ���
���������֮�ʹ���9����Ϊ���󡱣����������֮��С�ڵ���9����Ϊ��С����
�û��Ӽ�������Ѻ���ǡ����ӡ������󡱡���С�������ж��Ƿ�¶���*/
import java.util.Scanner;
class dice{
	public static void main(String[] args){
		int one = (int)(Math.random()*6 + 1);
		int two = (int)(Math.random()*6 + 1);
		int three = (int)(Math.random()*6 + 1);
		//System.out.println("���ӵ���ֵ�ǣ�" + one + " " + two + " " + three);
		Scanner input = new Scanner(System.in);
		System.out.print("�����֣�");
		String choice = input.next();
		if(one == two && two == three){
			System.out.println("����");
			if("����".equals(choice)){
				System.out.println("��ϲ���¶���");
			}else{
				System.out.println("���ź����´���");
			}
		}else{
			if((one + two + three) <= 9){
				System.out.println("����ǣ�С");
				if("С".equals(choice)){
				System.out.println("��ϲ���¶���");
				}else{
					System.out.println("���ź����´���");
				}
			}else if((one + two + three) > 9){
				System.out.println("����ǣ���");
				if("��".equals(choice)){
				System.out.println("��ϲ���¶���");
				}else{
					System.out.println("���ź����´���");
				}
			}
		}
	}
}