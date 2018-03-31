package day007;

public class TestArgsTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //两个值转换
		int i = 10;
		int j = 5;
//		System.out.println("i:" + i + " j:" + j);
//		int temp = i;
//		i = j;
//		j = temp;
//		System.out.println("i:" + i + " j:" + j);
		
		//封装到类方法
		TestArgsTransfer tt = new TestArgsTransfer();
		System.out.println("i:" + i + " j:" + j);
		tt.swap(i, j);//将i的值传递给m，j的值传递给n，实际无法转换
		System.out.println("i:" + i + " j:" + j);
	}
	
	//定义一个方法，交换两个变量的值，
	public void swap(int m,int n){
		int temp = m;
		m = n;
		n = temp;
		System.out.println("m:" + m + " n:" + n);
	}

}
