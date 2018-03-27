class exchange{
	public static void main(String[] args){
		int m = 111;
		int n = 233;
		System.out.println("m:"+m+"n:"+n);
		//1.提供中间变量
		int temp = m;
		m = n;
		n = temp;
		System.out.println("m:"+m+"n:"+n);

		//2.m,n较大可能会损失精度
		m = m+n;
		n = m-n;
		m = m-n;
		System.out.println("m:"+m+"n:"+n);

		//3.位运算
		m = m^n;
		n = m^n;
		m = m^n;
		System.out.println("m:"+m+"n:"+n);
	}
}
