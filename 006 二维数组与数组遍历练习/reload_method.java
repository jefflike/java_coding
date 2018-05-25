package day006;

public class reload_method {
	public static void main(String[] args) {
		int i = 4;
		int j = 8;
		int k = 6;
		overload ol = new overload();
		int sum = ol.getsum(i, j);
	    System.out.println(sum);
		int sum1 = ol.getsum(i, j, k);
	    System.out.println(sum1);
	}
}

class overload{
	public int getsum(int a, int b){
		return a+b;
	}
	
	public int getsum(int a, int b, int c){
		return a+b+c;
	}
	
	public double getsum(double d1,double d2){
		return d1 + d2;
	}
	
	//以下的两个方法构成重载。
	public void method1(int i,String str){
		
	}
	public void method1(String str1,int j){
		
	}
}
