class TestCopy{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			newArr[i] = arr[i];
		}
		
		System.out.print("ԭ���飺");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
		
		System.out.println();
		System.out.print("�����飺");
		for(int i = 0; i < arr.length; i++){
			System.out.print(newArr[i]);
		}
	}
}