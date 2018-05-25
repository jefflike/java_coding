/*5、求ax2+bx+c=0方程的根。a,b,c分别为函数的参数，
如果a≠0，那么：
（1）当b2-4ac>0，则有两个解；
（2）当b2-4ac=0，则有一个解；
（3）当b2-4ac<0，则无解；
如果a=0,b≠0，那么，

提示1：Math.sqrt(num);  sqrt指平方根
例如：
求x2-4x+1=0方程的根
求x2-2x+1=0方程的根*/
import java.util.Scanner;
class TestMath{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入a的值：");
		int a = input.nextInt();
		System.out.print("请输入b的值：");
		int b = input.nextInt();
		System.out.print("请输入c的值：");
		int c = input.nextInt();	
        
        if(a != 0){
			if(((b*b - 4*a*c) > 0)){
				double answer1 = (-b+Math.sqrt(b*b - 4*a*c)) / (2 * a);
				double answer2 = (-b-Math.sqrt(b*b - 4*a*c)) / (2 * a);
				System.out.println("方程解为"+answer1+"和"+answer2);
			}else if(((b*b - 4*a*c) == 0)){
				double answer3 = -(b / (2*a));
				System.out.println("方程唯一解为"+answer3);
			}else{
				System.out.println("方程无解");
				
			}
		}else if(a==0 && b != 0){
			double answer4 = -c / b;
			System.out.println("方程解为"+answer4);
		}		
	}
}