class fuzhiyunsuan{
	public static void main(String[] args){
		int i1 = 10;
                i1 += 3;//即i1 = i1 +3,但是这两者是有区别的
		//例如下面
		short s = 10;
		//s = s + 3;编译是无法通过的，会损失精度
		//s = (short)(s + 1);//强制修改精度，不建议
		s += 1;//即可以实现运算，又不会更改s的数据类型;
		System.out.println(s);
		/*
		 赋值运算符：=，+=，-=，×=，/=，%=
		  */

		//切记在java中=是赋值操作。
		boolean b1 = false;
		if(b1=true)
			System.out.println("结果为真");
                else
                        System.out.println("结果为假");
	}
}
