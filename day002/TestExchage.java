public class TestExchange{
	public static void main(String[] args){
		int a=4;
		int b=5;
		
		
		//int temp=a;
		//a=b;
		//b=temp;
		//System.out.println("交换后的a为："+a+",交换后的b为："+b);
		
		
		//int temp = a+b;
		//a = temp-a;
		//b = temp-a;
		//System.out.println("交换后的a为："+a+",交换后的b为："+b);
		
		
		int temp = a ^ b;//100 ^101==1
		a = temp ^ a;//
        b = temp ^a ;
		System.out.println("交换后的a为："+a+",交换后的b为："+b);
	}
}