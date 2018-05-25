package day005;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个二维数组
		int[][] scores;
		//二维数组初始化
		//静态初始化
		scores= new int[][]{{1,2},{2,8},{6,6,6,6}};
		String[][] names; 
		//动态初始化1
		names = new String[3][2];
		//动态初始化2
		names = new String[3][];
		names[0] = new String[2];
		names[1] = new String[1];
		names[2] = new String[3];

		
		//引用具体的某一个元素
		int[][] fuzhi = new int[3][2];
		fuzhi[0][1] = 12;
		fuzhi[2][1] = 33;
		
		
		//二维数组的长度：length属性
		System.out.println(fuzhi.length);//3
		//二维数组中元素的长度
		System.out.println(fuzhi[0].length);//2
		System.out.println(names.length);//6
		System.out.println(names[2].length);//8
		System.out.println();
		
		
		//for循环遍历数组
		for(int m = 0;m < scores.length;m++){//控制行数
			for(int n = 0;n < scores[m].length;n++){
				System.out.print(scores[m][n] + "  ");
			}
			System.out.println();
		}
	}
	
	

}
