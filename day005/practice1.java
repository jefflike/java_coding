import java.util.Scanner;
class TestArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum = 0;
		int maxScore = 0;
		int[] scores;
		scores = new int[5];
		for(int i = 0; i < 5; i++){
			System.out.print("�������"+(i + 1)+"һ��ͬѧ�ĳɼ���");
			scores[i] = input.nextInt();
			if(scores[i] <0 || scores[i] >100){
				System.out.println("����������");
				break;
			}
			maxScore = scores[i] > maxScore ? scores[i] : maxScore;
			sum += scores[i];
		}
		System.out.println("ƽ�����ǣ�" + (sum / scores.length));
		System.out.println("��߷��ǣ�" + maxScore);
	}
}