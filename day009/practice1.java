/*
声明一个圆Circle类，属性：半径radius，私有化，并提供get/set方法
提供：获取圆面积的方法

在测试类中创建圆对象，并为半径赋值，
并且在测试类中打印：圆半径是：xx，面积是：xx
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
		System.out.println("圆的半径是：" + c.getRadius()+"\t圆的面积是：" + c.getArea());
	}
}