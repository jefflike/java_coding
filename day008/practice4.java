/*
声明一个图形工具类
方法一：根据三角形的底边和对应底边的高求三角形的面积
	参数：三角形底边和高
	S = 底边 * 高 / 2
方法二：根据三角形的三条边长求三角形的面积
	参数：三角形的三条边
	
	提示：海伦公式
p = (a+b+c)/2
s = (p*(p-a)*(p-b)*(p-c))的平方根
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
		// 两边之和大于第三边才可以，其他的情况抛出异常
		double p = ( a+b+c ) / 2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}