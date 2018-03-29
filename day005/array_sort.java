package day005;

public class array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[]{-2, 4, 32, 44, 0, 10, -5};
	
	for(int i = 1;i<array1.length; i++){
		for(int j=0;j<array1.length-i;j++){
			if(array1[j]>array1[j+1]){
				int temp = array1[j+1];
				array1[j+1] = array1[j];
				array1[j] = temp;
			}
		}

	}
	for(int m=0;m<array1.length; m++){
		System.out.print(array1[m]+"\t");
	}
	System.out.println();
	}

}
