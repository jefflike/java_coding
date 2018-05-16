class TwoFind{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		int myFind = -1;
		int myIndex = arr.length / 2;
		
		
		while(true){
			if(myIndex == (arr.length - 1) || myIndex == 0){
			    System.out.println("Not Found");
				break;
		    }
			
			if(arr[myIndex] == myFind){
				System.out.println(myFind + "Ë÷ÒýÖµÊÇ£º" + myIndex);
				break;
			}else{
				if(arr[myIndex] > myFind){
					myIndex = myIndex / 2;
					//System.out.println(myIndex);
				}else{
					myIndex = myIndex + (arr.length - myIndex + 1) / 2;
					// System.out.println(myIndex);
				}
			}
		}
	}
}