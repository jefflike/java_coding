package day007;

public class javaArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaArgs jargs = new javaArgs();
		jargs.getSum(1,2,3,4);
		new javaArgs().getSum(123,223);
		jargs.getSum("求和是", 2,3,5,8);
	}
//	public int getSum(int ... args){
	public void getSum(int ... args){
		int sum = 0;
		//args使用与数组一致
		for(int i = 0; i<args.length;i++){
			sum += args[i];
		}
		System.out.println(sum);
//		return sum;
		
	}
	//重载，可变个数的形参声明在方法形参的最后
	public void getSum(String s,int ... args){
		int sum = 0;
		for(int i = 0; i<args.length;i++){
			sum += args[i];
		}
		System.out.println(s + ":"+ sum);
		
	}
}
