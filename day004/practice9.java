class TestWanShu{
	public static void main(String[] args) {
		int MyNum;
		for(int i = 1; i <= 1000; i++){
			MyNum = 0;
			for(int j = 1; j < i; j++){
				if(i % j == 0){
					MyNum += j;
				}
			}
		if(MyNum == i){
			System.out.println("wanshu:"+i);
		}
		}
	}
}