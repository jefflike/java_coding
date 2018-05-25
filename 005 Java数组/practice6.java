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
		
		System.out.println("价格最高的商品："+price[maxIndex]);
		System.out.println("价格最高的商品索引是："+maxIndex);
	}
}