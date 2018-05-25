import java.util.Scanner;
class TestNum{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("first number:");
		int first = input.nextInt();
		System.out.println("second number:");
		int second = input.nextInt();
		int MyNum=1;

		int min = (first <= second)?first:second;
		int max = (first >= second)?first:second;
		for(int i = 1; i <= min; i++){
			if(max % i == 0){
				MyNum = i;
			}
		}
		System.out.println("max gongyue:" + MyNum);
		System.out.println("max gongbei:" + (max*min)/MyNum);
	}
}