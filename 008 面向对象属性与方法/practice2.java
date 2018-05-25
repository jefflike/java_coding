/*
（1）声明一个圆类
属性：半径
（2）功能：
方法一：返回圆的面积
方法二：返回圆的周长
方法三：返回圆的直径
方法四：返回圆的信息
	半径是：xx，直径是：xx，面积是：xx，周长是：xx。
（3）声明一个测试类，
在测试类的主方法中，创建圆对象，为属性赋值，并分别调用四个方法显示信息
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
		String s = "半径是："+c.radius + "\t直径是：" + c.getLine(c.radius)+"\t面积是："+c.getArea(c.radius) +"\t周长是："+c.getZhouChang(c.radius);
		return s;
	}
}

class TestCircle{
	public static void main(String[] args){
		Circle c = new Circle();
		c.radius = 1;
		
		double area = c.getArea(c.radius);
		System.out.println("面积是：" + area);
		
		double length = c.getZhouChang(c.radius);
		System.out.println("周长是：" + length);
		
		double line = c.getLine(c.radius);
		System.out.println("直径是：" + line);
		
		String msg = c.getMessage(c);
		System.out.println(msg);
	}
}