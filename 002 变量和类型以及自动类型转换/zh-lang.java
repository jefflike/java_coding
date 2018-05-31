class HanZi{
	public static void main(String[] args){
		// 1.字符表现形式
		int a = (int)'a';
		System.out.println(a);//97
		
		int b = (int)'丁';
		System.out.println(b);//19969
		
		//int c = (int)'丁杰';
		//System.out.println(c);//只能放一个字符
		
		// 2. 转义字符类型的表示
		int c = (int)'\n';
		System.out.println(c);//10
		
		// 3. 使用字符的Unicode编码值
		char d = (char)'\u4E01';
		System.out.println(d);//丁
	}
}