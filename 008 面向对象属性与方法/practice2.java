/*
��1������һ��Բ��
���ԣ��뾶
��2�����ܣ�
����һ������Բ�����
������������Բ���ܳ�
������������Բ��ֱ��
�����ģ�����Բ����Ϣ
	�뾶�ǣ�xx��ֱ���ǣ�xx������ǣ�xx���ܳ��ǣ�xx��
��3������һ�������࣬
�ڲ�������������У�����Բ����Ϊ���Ը�ֵ�����ֱ�����ĸ�������ʾ��Ϣ
*/
class Circle{
	double radius;
	
	double getArea(double r){
		return Math.PI * r * r;
	}
	
	double getZhouChang(double r){
		return Math.PI * r * 2;
	}
	
	double getLine(double r){
		return r * 2;
	}
	
	String getMessage(Circle c){
		String s = "�뾶�ǣ�"+c.radius + "\tֱ���ǣ�" + c.getLine(c.radius)+"\t����ǣ�"+c.getArea(c.radius) +"\t�ܳ��ǣ�"+c.getZhouChang(c.radius);
		return s;
	}
}

class TestCircle{
	public static void main(String[] args){
		Circle c = new Circle();
		c.radius = 1;
		
		double area = c.getArea(c.radius);
		System.out.println("����ǣ�" + area);
		
		double length = c.getZhouChang(c.radius);
		System.out.println("�ܳ��ǣ�" + length);
		
		double line = c.getLine(c.radius);
		System.out.println("ֱ���ǣ�" + line);
		
		String msg = c.getMessage(c);
		System.out.println(msg);
	}
}