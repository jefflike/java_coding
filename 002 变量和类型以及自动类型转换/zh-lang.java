class HanZi{
	public static void main(String[] args){
		// 1.�ַ�������ʽ
		int a = (int)'a';
		System.out.println(a);//97
		
		int b = (int)'��';
		System.out.println(b);//19969
		
		//int c = (int)'����';
		//System.out.println(c);//ֻ�ܷ�һ���ַ�
		
		// 2. ת���ַ����͵ı�ʾ
		int c = (int)'\n';
		System.out.println(c);//10
		
		// 3. ʹ���ַ���Unicode����ֵ
		char d = (char)'\u4E01';
		System.out.println(d);//��
	}
}