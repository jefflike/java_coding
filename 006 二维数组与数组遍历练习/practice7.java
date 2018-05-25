class SelectSort{
	public static void main(String[] args){
		int[] arr = {32, 23, 19, 4, 90, 6};
		
		
		for(int i = 1; i <= arr.length; i++){//次数
		    int myIndex = i - 1;
			for(int j = i; j < arr.length; j++){//找出最小值
				if(arr[j] < arr[myIndex]){
					myIndex = j;
				}
			}
			if(myIndex != i-1){
				int temp = arr[i -1];
				arr[i - 1] = arr[myIndex];
				arr[myIndex] = temp;
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}