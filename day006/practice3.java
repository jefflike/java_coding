import java.util.Scanner;
class TestCopy1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入新数组的长度：");
		int newArrLength = input.nextInt();
		
		int[] arr = {1,2,3,4,5};
		int[] newArr = new int[newArrLength];
		
		for(int i = 0; i < arr.length && i < newArr.length; i++){
			newArr[i] = arr[i];
		}
		
		System.out.print("原数组：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
		
		System.out.println();
		System.out.print("现数组：");
		for(int i = 0; i < newArr.length; i++){
			System.out.print(newArr[i]);
		}
	}
}