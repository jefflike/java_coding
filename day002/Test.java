public class Test{
	public static void main(String[] args){
		//float f = 3.0;//损失精度
		byte a=10;
		char b = 'a';
		short c = 2;
		byte d = (char)(b+b);//不兼容类型
		System.out.println((a+b));
		System.out.println((c+b));
		System.out.println((b+b));
	}
}