/*4����Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů����
��ȻҪ���һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
���������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
������������������㣬�򣺡����ޣ���
��ʾ���Ӽ�������
Scanner input=new Scanner(System.in);
input.nextInt();//���մӼ��������һ������
input.next();����һ���ַ���
input.nextDouble();//����һ��С��
input.nextBoolean();//����һ������ֵ

���磺
System.out.println(�����:(cm)��);
input.nextInt();
System.out.println(���Ƹ�:(ǧ��)��);
input.nextDouble();
System.out.println(��˧��:(true/false)��);   (��/��)
input.nextBoolean();   ����   input.next();   ���ǡ�.equals(str)*/
import java.util.Scanner;
class TestMarry{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("���:(cm)");
        int height = input.nextInt();
		
		System.out.print("�Ƹ�:(ǧ��)");
        double money = input.nextDouble();
		
		System.out.println("˧��:(true/false)");
        boolean looklike = input.nextBoolean();
		
		if(height >= 180 && money >= 1 && looklike == true){
			System.out.println("��һ��Ҫ�޸���!!!");
		}else if(height >= 180 || money >= 1 || looklike == true){
			System.out.println("�ްɣ����ϲ��㣬�������ࡣ");
		}else{
			System.out.println("����");
		}
	}
}