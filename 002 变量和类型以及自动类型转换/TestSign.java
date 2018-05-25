public class TestSign{
	public static void main(String[] args){
		int i1 = 10;
		int i2 = 20;
		int i = i1++;
		System.out.println("i1 = "+i1);
		System.out.println("i = "+i);
		i = ++i1;
		System.out.println("i1 = "+i1);
		System.out.println("i = "+i);
		i = i2 --;
		System.out.println("i2 = "+i2);
		System.out.println("i = "+i);
		i = --i2;
		System.out.println("i2 = "+i2);
		System.out.println("i = "+i);
	}
	
}
