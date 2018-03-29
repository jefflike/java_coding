package day005;

public class short_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] i = new int[]{12, 13, 14};
        int[] j = new int[10];
        
        for(int k = 0; k<i.length; k++){
        	j[k] = i[k];
        }
        
        j[3] = 15;
        j[4] = 16;
        
		for(int k = 0;k < j.length;k++){
			System.out.println(j[k]);
	}

}

}