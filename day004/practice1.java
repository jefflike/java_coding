class TestFor{
	public static void main(String[] args){
		int sum = 0;
		int threesum = 0;
		for(int i = 0; i <= 100; i++){
			if(i%2 == 0){
				sum += i;
			}
			if(i%3 == 0){
				threesum += i;
			}
		}
		System.out.println("100以内的偶数和：" + sum);
		System.out.println("100以内3的倍数值得和" + threesum);
	}
}