class TestMin{
	public static void main(String[] args){
		int[] arr = new int[]{23, 12,345, 3, 17};
		int myMinIndex = 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[myMinIndex] > arr[i]){
				myMinIndex = i;
			}
		}
		System.out.println("最小值的下标是：" + myMinIndex);
		System.out.println("最小值是：" + arr[myMinIndex]);
	}
}