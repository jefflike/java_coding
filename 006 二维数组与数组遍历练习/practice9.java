class MulArray1{
	public static void main(String[] args){
		int[][] arr = new int[5][5];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j <arr[i].length; j++){
				arr[i][j] = i;
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < i; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}