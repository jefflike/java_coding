class exchange{
	public static void main(String[] args){
		int myInt = 12345;
		byte myByte = (byte)myInt;
		System.out.println(myByte);
		char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
        String str = "abc";
        String str1 = str + myInt;
        System.out.println(str1);
	}
}