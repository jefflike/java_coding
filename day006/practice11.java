/*
���ڶ��ֲ��ң��˽⣩

�㷨��
1��ʱ��Ϳռ临�Ӷ� ��Ч��
*/
class SuanFa8_Find{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//Ҫ�������������
		//���ֲ��ҷ�����Ҫ���ҵķ�Χ���м俪ʼ���ң�������ֵ�ȡ��м䡿��ֵ�󣬾�ȥ�����ұߡ�
		//���ظ��ղŵĹ��̣���һ�뿪ʼ���ң�....
		//һ�ֽ�����ҵ���
		//��һ�ֽ����û�ҵ�
		int findValue = 9;
		int findIndex = -1;
		int count = 0;//ͳ��һ���Ƚϣ������˼���
		
		
		//���뷨��arr.length=5
		int nowIndex = arr.length/2;
		while(true){
			count++;
			if(arr[nowIndex] == findValue){
				findIndex = nowIndex;
				break;
			}else{
				//�ж��Ƿ��Ѿ�����߽磬�����,��������û��Ҫ�޸�nowIndex��������Ҫ�������������
				if(nowIndex==0 || nowIndex==arr.length-1){
					break;
				}
				
				//�ж�������������
				if(arr[nowIndex] > findValue){
					//����߲���
					//�޸�nowIndexΪ��ߵ�һ��
					nowIndex = nowIndex/2;
				}else{
					//���ұ߲���
					nowIndex = nowIndex + (arr.length-nowIndex)/2; 
				}
			}
		}
		
		
		if(findIndex==-1){
			System.out.println(findValue + "�������в�����");
		}else{
			System.out.println(findValue + "�������е�λ�þ���"  + findIndex);
		}
		System.out.println("һ���Ƚ���" + count + "��");
	}
}