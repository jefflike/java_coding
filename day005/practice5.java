import java.util.Scanner;
class GroupStudentName{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入总人数：");
		int amount = input.nextInt();
		String[] names = new String[amount];
		for(int i=0; i<names.length; i++){
			String name = input.next();
			names[i] = name;
		}
		
		for(int i=0; i<names.length; i++){
			System.out.println("本组第"+(i+1)+"个同学是"+names[i]);
		}
	}
}