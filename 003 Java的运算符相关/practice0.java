import java.util.Scanner;
class TestScore{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������ĳɼ���");
		int score = input.nextInt();
		if(score >=0 && score <= 100){
			if(score >= 60){
				System.out.println("�ϸ�");
			}else{
				System.out.println("���ϸ�");
			}
		}else{
			System.out.println("�������󣬲��ڷ�Χ��");
		}
	}
}