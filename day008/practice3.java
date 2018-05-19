/*
��1������һ��ͼ�ι�����
���ܣ�
����һ����ӡԲ����Ϣ
	�뾶�ǣ�xx��ֱ���ǣ�xx������ǣ�xx���ܳ��ǣ�xx��
����������ӡԲ������Ϣ
	�ױ߰뾶�ǣ�xx�����ǣ�xx���ױ�����ǣ�xx�������xx��
��2������һ��������
����Բ���塢Բ�Ķ��󣬲�Ϊ���Ը�ֵ
����ͼ�ι�������󣬲����������������ֱ���ʾԲ��Բ�������Ϣ
*/
class Manager{
	
	String getCircleMessage(Circle c){
		String s = "�뾶�ǣ�"+c.radius + "\tֱ���ǣ�" + c.getLine(c.radius)+"\t����ǣ�"+c.getArea(c.radius) +"\t�ܳ��ǣ�"+c.getZhouChang(c.radius);
		return s;
	}
	
	String getYuanZhuMessage(YuanZhu yn){
		return "Բ���ĵ���뾶�ǣ�"+yn.radius + "\t���ǣ�"+yn.height +"\t���������"+yn.getArea(yn.radius)+"\t����ǣ�"+yn.getV(yn.radius,yn.height);
	}
	
}

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
	
}

class YuanZhu{
	double radius;
	double height;
	
	double getArea(double radius){
		double area = Math.PI * radius * radius;
		return area;
	}
	
	double getV(double radius, double height){
		double v = Math.PI * radius * radius * height;
		return v;
	}
	
}

class TestMessage{
	public static void main(String[] args){
		Circle c = new Circle();
		c.radius = 2;
		
		YuanZhu y = new YuanZhu();
		y.radius = 2;
		y.height = 10;
		
		Manager m = new Manager();
		String cmes = m.getCircleMessage(c);
		String ymes = m.getYuanZhuMessage(y);
		
		System.out.println(cmes);
		System.out.println(ymes);
	}
}
