/* 
���ֲ���*/

class BinarySearch{
	public static void main(String[] args){
		
		int[] arr = new int[]{1,2,3,4,5,6,7};
		
		int myIndex = arr.length / 2;
		int myFind = -1;
		
		while(true){
			if(myFind == arr[myIndex]){
				System.out.println("Ҫ�ҵ���������Ϊ��"+myIndex);
				break;
			}else{
				if(myIndex>=arr.length-1 || myIndex==0){
					System.out.println("��Ҫ���ҵ��������ڣ�");
					break;
				}
				if(arr[myIndex] > myFind){
					myIndex = myIndex / 2;
				}else{
					myIndex = myIndex + myIndex / 2;
				}
			}
		}
	}
}