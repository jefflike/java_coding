package day007;

//圆的面积
class circle {
    double radius;
	public double getArea() {
		// TODO Auto-generated method stub
        return Math.PI * radius * radius;
	}
	
	public void setRadius(double r){
		radius = r;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void show(){
		System.out.println("我是一个圆");
	}
	
}


public class lambda{
	public void printArea(circle c, int time){
		System.out.println("radius"+"\t"+"area");
		for(int i =1;i<= time;i++){
			c.setRadius(i);
			System.out.println(c.getRadius() + "\t" + c.getArea());
		}
	}
	
	public static void main(String[] args){
		lambda p = new lambda();
		circle c = new circle();//新的圆半径为0
		p.printArea(c, 5);
		
		new circle().show();//这个对象就是匿名对象，只使用一次后就无法再次调用
	}
}
