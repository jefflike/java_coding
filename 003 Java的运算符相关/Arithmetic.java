class Arithmetic{
	public static void main(String[] args){
		int z =1;
		z = z++;
		
		// �˴���zʱ�ȸ�ֵ����++������ģ���ô��z����++��ǰ�Ѿ���ֵ���˱���z����ʱ����z֮��Ļ���ԭ���ǿ��ڴ�
		// ���ڵ�++�����++֮����ڴ棬û�б���ָ�򣬱�gc�������֮ǰ��z�����Ѿ����˸�ֵ��ָ���ˣ�������Ȼָ����֮ǰ��z�����Ϊ1
		System.out.println(z);//1
		
		int a = 10;
		int b;
		//b = a;//���ʽ����;�ͳ������
		System.out.println(b=a);//10 (1)��a��ֵ��ֵ��b��2�����Ҵ�ӡb=a���ʽ��ֵ
		
		boolean flag = false;
		if(flag = true){//����һ����ֵ��䣬���ǱȽ����
			System.out.println("����������");//����������
		}
	}
}