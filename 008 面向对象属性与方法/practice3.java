/*
（1）声明一个图形管理类
功能：
方法一：打印圆的信息
	半径是：xx，直径是：xx，面积是：xx，周长是：xx。
方法二：打印圆柱体信息
	底边半径是：xx，高是：xx，底边面积是：xx，体积是xx。
（2）声明一个测试类
创建圆柱体、圆的对象，并为属性赋值
创建图形管理类对象，并调用两个方法，分别显示圆和圆柱体的信息
*/
class Manager{
	
	String getCircleMessage(Circle c){
		String s = "半径是："+c.radius + "\t直径是：" + c.getLine(c.radius)+"\t面积是："+c.getArea(c.radius) +"\t周长是："+c.getZhouChang(c.radius);
		return s;
	}
	
	String getYuanZhuMessage(YuanZhu yn){
		return "圆柱的底面半径是："+yn.radius + "\t高是："+yn.height +"\t底面面积："+yn.getArea(yn.radius)+"\t体积是："+yn.getV(yn.radius,yn.height);
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
