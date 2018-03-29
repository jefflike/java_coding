package day005;

class myarray1 {
	public static void main(String[] args) {
		//1.如何定义一个数组
		//1.1数组的声明
		String[] names;
		int scores[];
		//1.2初始化
		//第一种：静态初始化:初始化数组与给数组元素赋值同时进行。
		names = new String[]{"jeff","frank","xixi"};
		
		//第二种：动态初始化：初始化数组与给数组元素赋值分开进行。
		scores = new int[4];
		//2.如何调用相应的数组元素：通过数组元素的下角标的方式来调用。
		//下角标从0开始，到n -1 结束。其中n表示的数组的长度。
		scores[0] = 87;
		scores[1] = 89;
		scores[3] = 98;
		//3.数组的长度：通过数组的length属性。
		System.out.println(names.length);//3
		System.out.println(scores.length);//4
		//4.如何遍历数组元素
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
		for(int i = 0;i < names.length;i++){
			System.out.println(scores[i]);
			System.out.println(names[i]);
		}
	}
}
