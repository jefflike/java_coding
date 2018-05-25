class sanyuan{
	public static void main(String[] args){
		int i = 10;
		int j = 20;
		int max = (i > j)?i:j;
		System.out.println("较大值是"+max);

		String str = (i > j)?"i大":(i == j)?"相等":"j大";
		System.out.println(str);
	}
}
