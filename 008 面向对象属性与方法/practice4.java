/*
����һ��ͼ�ι�����
����һ�����������εĵױߺͶ�Ӧ�ױߵĸ��������ε����
	�����������εױߺ͸�
	S = �ױ� * �� / 2
�����������������ε������߳��������ε����
	�����������ε�������
	
	��ʾ�����׹�ʽ
p = (a+b+c)/2
s = (p*(p-a)*(p-b)*(p-c))��ƽ����
*/

class TestTriangle{
	public static void main(String[] args){
		Triangle t = new Triangle();
		t.bottom = 3;
		t.height = 4;
		double v = t.getArea(t.bottom, t.height);
		System.out.println(v);
		
		t.bian1 = 4;
		t.bian2 = 5;
		double value = t.getArea(t.bottom, t.bian1, t.bian2);
		System.out.println(value);
	}
}

class Triangle{
	double bottom;
	double height;
	double bian1;
	double bian2;
	
	double getArea(double di, double gao){
		return (bottom * height) / 2;
	}
	
	double getArea(double a, double b, double c){
		// ����֮�ʹ��ڵ����߲ſ��ԣ�����������׳��쳣
		double p = ( a+b+c ) / 2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}