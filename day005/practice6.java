import java.util.Scanner;
class TestPrice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] price = new double[5];
		for(int i=0; i<price.length; i++){
			double perPrice = input.nextDouble();
			price[i] = perPrice;
		}
		int maxIndex = 0;
		for(int i=0; i<price.length; i++){
			if(price[i] > price[maxIndex]){
				maxIndex = i;
			}
		}
		
		System.out.println("�۸���ߵ���Ʒ��"+price[maxIndex]);
		System.out.println("�۸���ߵ���Ʒ�����ǣ�"+maxIndex);
	}
}