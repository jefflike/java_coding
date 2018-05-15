import java.util.Scanner;
import java.util.Random;
class TestDoWhile{
	public static void main(String[] args){
		Random rand = new Random();
		int num = rand.nextInt(100);
		int count = 0;

		Scanner input = new Scanner(System.in);
		do{
			int guess = input.nextInt();
						if(guess > num){
				System.out.println("too big");
				count += 1;
			}else if(guess < num){
				System.out.println("too small");
				count += 1;
			}else{
				count += 1;
				System.out.println("congratulations");
				System.out.println("count:" + count);
				break;
			}
		}
		while(true);
	}
}