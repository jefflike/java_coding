/*
��1������Բ������
���ԣ��ױ߰뾶�͸�
��2�����ܣ�
����һ�����صױ����
������������Բ�������
������������Բ�������Ϣ
	�ױ߰뾶�ǣ�xx�����ǣ�xx���ױ�����ǣ�xx�������xx��
*/
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
	
	String getMessage(YuanZhu yn){
		return "Բ���ĵ���뾶�ǣ�"+yn.radius + "\t���ǣ�"+yn.height +"\t���������"+yn.getArea(yn.radius)+"\t����ǣ�"+yn.getV(yn.radius,yn.height);
	}
}

class TestYuanZhu{
	public static void main(String[] args){
		YuanZhu y1 = new YuanZhu();
		y1.radius = 1;
		y1.height = 10;
		
		String mes = y1.getMessage(y1);
		System.out.println(mes);
		double yuanArea = y1.getArea(y1.radius);
		System.out.println("����Բ������ǣ�" + yuanArea);
	}
}