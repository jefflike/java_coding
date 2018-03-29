package day005;

public class array_sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//直接选择排序
		int[] array1 = new int[]{-2, 4, 32, 44, 0, 10, -5};
		for(int i = 0;i<array1.length; i++){
			for(int j=i;j<array1.length;j++){
//				int array_min=array1[i];
				if(array1[i]>array1[j]){
					int temp = array1[j];
					array1[j] = array1[i];
					array1[i] = temp;
				}
			}

		}
		for(int m=0;m<array1.length; m++){
			System.out.print(array1[m]+"\t");
		}
		System.out.println();
		}


	}


