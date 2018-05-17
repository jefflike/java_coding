class SelectSort{
	public  static void main(String[] atgs){
		int[] arr = new int[]{23,65,12,6,9,56,89};
		
		
		for(int i=0; i<arr.length; i++){
			//当次最小
			int minIndex = i;
			
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		for(int a : arr){
			System.out.println(a);
		}
	}
}