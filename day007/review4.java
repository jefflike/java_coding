class MulArray{
	public static void main(String[] args){
		int[][] arr = new int[5][];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = new int[arr.length-i];
			for(int j=0; j<arr.length-i; j++){
				arr[i][j] = arr.length-i;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-i; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}