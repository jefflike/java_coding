class TestFlower{
	public static void main(String[] args) {
		for(int i = 100; i < 1000; i++){
			int hundred = i / 100;
			int ten = i % 100 / 10;
			int num = i % 10;
			int newNum = hundred*hundred*hundred + ten*ten*ten + num*num*num;
			if(i == newNum){
				System.out.println("newNum:" + i);
			}
		}
	}
}