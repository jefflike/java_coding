package day006;

public class array_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{2, -2, 78, -18, 23, 3,10,-2};
		array_util au = new array_util();
		int max = au.getMax(arr);
		System.out.println("最大值为：" + max);
		
		int min = au.getMin(arr);
		
		int sum = au.getSum(arr);
		System.out.println("和为：" + sum);

		int[] reverse = au.getReverse(arr);
		System.out.println("倒序为：" );
		for(int i=0;i<reverse.length;i++){
			System.out.print(arr[i]+"\t");
		}
		
	}

}
