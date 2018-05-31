class TestChar{
	public static void main(String[] args){
		//char a = '';//不能这样定义一个空字符，编译会出错
		//System.out.println(a);
		
		int b = (int)' ';//此处是一个空格，''里面必须有东西
		System.out.println(b);//32
		
		
		int c = '\n';//1.存储范围小的常量值和变量值可以直接赋值给存储范围大的变量
		System.out.println(c);//10
		
		char d = (int)'\u4E01';
		System.out.println(d);//丁
		
		int e = (char)'\u4E01';
		System.out.println(e);//19969
		
		//2.byte,short,char之间不能运算，一运算（加减乘除等），最小提升为int
		byte f = 2;
		char g = 'a';
		//f = f + g;//损失精度
		f += g;//自动强制类型转换了
		System.out.println(f);//99
		
		// 3.boolean不与任何转换
		// int h = true + 1;// 错误: 二元运算符 '+' 的操作数类型错误
		//int $1 = true;//boolean无法转换为int
		int $1 = (int)10.0;
		System.out.println($1);//10
		
		int $2=3,$3=4;
		//int $2,$3=3,4;//java里不可以这样赋值
		System.out.println($2);
		System.out.println($3);
	}
}