package day006;

public class array_util {

	public int getMax(int[] arr){
		int max = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	public int getMin(int[] arr){
		int min = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	
	public int getSum(int[] arr){
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum +=arr[i];
		}
		return sum;
	}
	
	public int getAvg(int[] arr){
		int sum = getSum(arr);
		return sum/arr.length;
	}
	
	public int[] getReverse(int[] arr){//返回的类型也要是数组
		for(int i=0,j=arr.length-1;i<j;i++,j--){
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	// 实现数组的复制
	public int[] copy(int[] arr) {
		// int[] arr1 = arr;
		// return arr1;
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}

	// 对数组进行排序
	public void sort(int[] arr, String desc) {
		if (desc == "asc") {// ascend:从小到大
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						swap(arr,j,j+1);
						//swap(arr[j],arr[j + 1]);
					}
				}
			}
		} else if (desc == "desc") {// 从大到小
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] < arr[j + 1]) {
						swap(arr,j,j+1);
						//swap(arr[j],arr[j + 1]);
					}
				}
			}
		} else {
			System.out.println("您输入的排序方式有误！");
		}
	}
	
	//交换数组中指定位置的元素:交换arr数组中索引为i和j的两个元素
	public void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}


