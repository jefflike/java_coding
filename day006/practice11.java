/*
关于二分查找（了解）

算法：
1、时间和空间复杂度 ：效率
*/
class SuanFa8_Find{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//要求：数组是有序的
		//二分查找法：从要查找的范围的中间开始查找，如果这个值比【中间】的值大，就去它【右边】
		//又重复刚才的过程，从一半开始查找，....
		//一种结果是找到了
		//另一种结果，没找到
		int findValue = 9;
		int findIndex = -1;
		int count = 0;//统计一共比较，查找了几次
		
		
		//代入法：arr.length=5
		int nowIndex = arr.length/2;
		while(true){
			count++;
			if(arr[nowIndex] == findValue){
				findIndex = nowIndex;
				break;
			}else{
				//判断是否已经到达边界，如果是,结束，就没必要修改nowIndex，即不需要往左后往后再找
				if(nowIndex==0 || nowIndex==arr.length-1){
					break;
				}
				
				//判断是往左还是往右
				if(arr[nowIndex] > findValue){
					//往左边查找
					//修改nowIndex为左边的一半
					nowIndex = nowIndex/2;
				}else{
					//往右边查找
					nowIndex = nowIndex + (arr.length-nowIndex)/2; 
				}
			}
		}
		
		
		if(findIndex==-1){
			System.out.println(findValue + "在数组中不存在");
		}else{
			System.out.println(findValue + "在数组中的位置就是"  + findIndex);
		}
		System.out.println("一共比较了" + count + "次");
	}
}