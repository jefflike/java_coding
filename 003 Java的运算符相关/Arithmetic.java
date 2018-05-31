class Arithmetic{
	public static void main(String[] args){
		int z =1;
		z = z++;
		
		// 此处的z时先赋值再做++，运算的，那么在z进行++以前已经赋值给了变量z，此时变量z之乡的还是原来那块内存
		// 现在的++变成了++之后的内存，没有变量指向，被gc处理掉。之前的z变量已经做了赋值的指向了，所以依然指的是之前的z，结果为1
		System.out.println(z);//1
		
		int a = 10;
		int b;
		//b = a;//表达式加了;就成了语句
		System.out.println(b=a);//10 (1)把a的值赋值给b（2）并且打印b=a表达式的值
		
		boolean flag = false;
		if(flag = true){//这是一个赋值语句，不是比较语句
			System.out.println("条件成立！");//条件成立！
		}
	}
}