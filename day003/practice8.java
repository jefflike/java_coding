/*8、使用 switch 把小写类型的 char型 a, b, c, d转为大写；
把阿拉伯数字的char型1,2,3,4转为“壹，贰，叁，肆”；其它的都输出 “other”。*/
import java.util.Scanner;
class partExchange{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要转换的值：");
		String write = input.next();
		char word = write.charAt(0);
		switch(word){
			case 'a':
			    System.out.println('A');
				break;
			case 'b':
			    System.out.println('B');	
				break;
			case 'c':
			    System.out.println('C');
				break;
			case 'd':
			    System.out.println('D');
				break;
			case '1':
			    System.out.println('壹');
				break;
			case '2':
			    System.out.println('贰');
				break;
			case '3':
			    System.out.println('叁');
				break;
			case '4':
			    System.out.println('肆');
                break;	 	
            default:
			    System.out.println("other");
                break;	 	
		}
	}
}