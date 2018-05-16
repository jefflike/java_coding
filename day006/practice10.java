/*
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1
 ....
*/

class YangHui{
	public static void main(String[] args){
		int[][] arr = new int[10][];
		
		//arr[0] = new int[1];
		//arr[1] = new int[2];
		
		arr[0] = new int[]{1};
		arr[1] = new int[]{1,1};
		
		// 打印10行
		for(int i = 2; i < arr.length; i++){
			arr[i] = new int[i+1];
			arr[i][0] = 1;
			for(int j = 1; j < arr[i].length-1; j++){
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
			arr[i][i] = 1;
		}
		
		// 循环打印
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}