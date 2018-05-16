import java.util.Scanner;
class TestIndex{
	public static void main(String[] args){
		int[] arr = {2,4,5,9,7};
		int index = -1;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入查询数值:");
		int value = input.nextInt();
		for(int i = 0; i < arr.length; i++){
			if(value == arr[i]){
				index = i;
			}
		}
		if(index != -1){
		    System.out.println("索引是："+index);
		}else{
			System.out.println("数组无此数值。");
		}
	}
}