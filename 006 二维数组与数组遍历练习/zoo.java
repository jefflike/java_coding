package day006;

public class zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//基本数据类型的声明：数据类型 变量名 = 初始化值
		int i = 10;
		//类的实例化:如下的a1就是一个实实在在的对象
		animal a1 = new animal();
		//int[] arr = new int[10];
		System.out.println("name:" + a1.name + " age:" + a1.age);
		//通过对象调用属性
		a1.name = "花花";
		a1.age = 3;
		System.out.println("name:" + a1.name + " age:" + a1.age);
		//通过对象调用方法
		a1.eat();
		a1.sleep();
		
		//再创建一个类的对象
		animal a2 = new animal();
		System.out.println("name:" + a2.name + " age:" + a2.age);//null 0
		a2.name = "小花";
		System.out.println("name:" + a1.name + " age:" + a1.age);
		System.out.println("name:" + a2.name + " age:" + a2.age);
		
		//a3不意味着相较于a1重新创建的一个对象，而是a1与a3共用一个对象实体
		animal a3 = a1;
		System.out.println("name:" + a3.name + " age:" + a3.age);//与a1一样
		a3.name = "维尼熊";
		System.out.println("a1：name:" + a1.name + " age:" + a1.age);
		
		System.out.println(a2.getName());//a2.name;
		System.out.println(a2.desc());
	}
	

}


class animal{
	//1.属性
	String name;
	int age;
	
	//2.方法
	public void eat(){
		System.out.println("动物进食");
	}
	
	public void sleep(){
		System.out.println("动物休眠");
		//return;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		System.out.println("hello");
		return age;
		//其后不可以声明语句
		//System.out.println("hello");
	}
	//当通过对象调用此方法时，会将方法的方法的返回值提供给方法的调用者，也就是当前的对象。
	public String desc(){
		if(age > 2){
			return "恰同学少年";
		}else{
			return "还是看动画片的年龄";
		}
	}
	public void setName(String n){//n:局部变量
		name = n;
	}
	public void addAge(){
		int i = 0;//局部变量
		age += i;
	}
	public void info(){
//		可以在方法内调用本类的其他方法，但是不可以在方法内定义新的方法
		eat();
		sleep();
//		public void breath(){
//			System.out.println("呼吸");
//		}
	}

}