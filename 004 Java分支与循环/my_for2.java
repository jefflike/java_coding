//100以内偶数的和
class myfor2{
	public static void main(String[] args){
                int sum = 0;
		for(int i = 1;i<101;i++){
			if(i % 2 ==0){
				sum +=i;
			}
		}
		System.out.println(sum);
	}
}
