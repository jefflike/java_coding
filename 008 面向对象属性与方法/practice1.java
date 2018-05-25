/*
（1）声明圆柱体类
属性：底边半径和高
（2）功能：
方法一：返回底边面积
方法二：返回圆柱体体积
方法三：返回圆柱体的信息
	底边半径是：xx，高是：xx，底边面积是：xx，体积是xx。
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
		return "圆柱的底面半径是："+yn.radius + "\t高是："+yn.height +"\t底面面积："+yn.getArea(yn.radius)+"\t体积是："+yn.getV(yn.radius,yn.height);
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
		System.out.println("底面圆的面积是：" + yuanArea);
	}
}