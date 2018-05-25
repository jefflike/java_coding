class TestReverse{
	public static void main(String[] args){
		int[] arr = new int[]{23, 12, 4, 12, 33, 1};
		for(int i = 0; i < arr.length / 2; i++){
			int temp;
			temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;			
		}
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}