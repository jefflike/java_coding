class Bubblue{
	public static void main(String[] args){
		int[] arr = {5,3,8,1,9};
		for(int i=0; i<arr.length;i++){
			for(int j=arr.length-1; j>0; j--){
				if(arr[j]>arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
	}
}