class logicdiff{
	public static void main(String[] args){
		boolean b = false;
		int i1 = 10;
		//此处编译会报错
		if(b & (10 / 0 == 0){
			System.out.println("good");
		}else{
			System.out.println("bad");
		}
		System.out.println(i1);
	
		int i2 = 10;
		if(b && 10/0 == 0){
			System.out.println("good");
		}else{
			System.out.println("bad");
		}
		System.out.println(i2);
	
}
}
