class TestChar{
	public static void main(String[] args){
		//char a = '';//������������һ�����ַ�����������
		//System.out.println(a);
		
		int b = (int)' ';//�˴���һ���ո�''��������ж���
		System.out.println(b);//32
		
		
		int c = '\n';//1.�洢��ΧС�ĳ���ֵ�ͱ���ֵ����ֱ�Ӹ�ֵ���洢��Χ��ı���
		System.out.println(c);//10
		
		char d = (int)'\u4E01';
		System.out.println(d);//��
		
		int e = (char)'\u4E01';
		System.out.println(e);//19969
		
		//2.byte,short,char֮�䲻�����㣬һ���㣨�Ӽ��˳��ȣ�����С����Ϊint
		byte f = 2;
		char g = 'a';
		//f = f + g;//��ʧ����
		f += g;//�Զ�ǿ������ת����
		System.out.println(f);//99
		
		// 3.boolean�����κ�ת��
		// int h = true + 1;// ����: ��Ԫ����� '+' �Ĳ��������ʹ���
		//int $1 = true;//boolean�޷�ת��Ϊint
		int $1 = (int)10.0;
		System.out.println($1);//10
		
		int $2=3,$3=4;
		//int $2,$3=3,4;//java�ﲻ����������ֵ
		System.out.println($2);
		System.out.println($3);
	}
}