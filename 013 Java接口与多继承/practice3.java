public class TestProblem1 {
	public static void main(String[] args) {
		MySub m = new MySub();
		m.method();
	}
}
interface A{
	public default void method(){
		System.out.println("A接口的默认方法");
	}
}
interface B{
	public default void method(){
		System.out.println("B接口的默认方法");
	}
}
// 实现了A和B，A和B都有自己的默认方法
class MySub implements A,B{
	
/*	
	@Override
	public void method() {
		A.super.method();//保留A的方法实现
	}*/
	
/*	
	@Override
	public void method() {
		B.super.method();//保留B的方法实现
	}*/
	
/*	
	@Override
	public void method() {
		A.super.method();//保留A的方法实现
		B.super.method();//也保留B的方法实现
	}*/
	
	//选择C
	@Override
	public void method() {
		System.out.println("我选择其他");
	}
}