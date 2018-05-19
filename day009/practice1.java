/*
����һ��ԲCircle�࣬���ԣ��뾶radius��˽�л������ṩget/set����
�ṩ����ȡԲ����ķ���

�ڲ������д���Բ���󣬲�Ϊ�뾶��ֵ��
�����ڲ������д�ӡ��Բ�뾶�ǣ�xx������ǣ�xx
*/
class Circle{
	private double radius;
	
	void setRadius(double r){
		if(r<=0){
			return ;
		}
		radius = r;
	}
	
	double getRadius(){
		return radius;
	}
	
	double getArea(){
		return Math.PI * radius * radius;
	}
}

class TestCircle{
	public static void main(String[] args){
		Circle c = new Circle();
		c.setRadius(-1);
		System.out.println("Բ�İ뾶�ǣ�" + c.getRadius()+"\tԲ������ǣ�" + c.getArea());
	}
}