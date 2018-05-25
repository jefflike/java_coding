class breakcontinue{
	public static void main(String[] args) {
			label:for(int i = 1;i < 5;i++){
			for(int j = 1;j <= 10;j++){
				if(j % 4 == 0){
					//break;
					//continue;
					break label;
					//continue label;//跳出此标签的本次循环，此处时最外层的本次循环
				}
				System.out.print(j);
			}
			System.out.println();
		}
    }
}
