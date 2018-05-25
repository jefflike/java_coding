package day006;

public class car_factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory f= new factory();
		car newCar = f.producerCar();
		newCar.info();
		
		car newCar1 = f.producerCar("卡车",8);
		newCar1.info();

	}

}

//先定义一个车子类
class car{
	String name;
	int wheel;
	
	public void info(){
		System.out.println("name:" + name + " wheel:" + wheel);
	}
}

//定义一个工厂类
class factory{
	public car producerCar(){
		return new car();
	}
	//重载一个生产汽车方法
	public car producerCar(String n,int w){
		car c = new car();
		c.name=n;
		c.wheel = w;
		return c;
	}
	
}