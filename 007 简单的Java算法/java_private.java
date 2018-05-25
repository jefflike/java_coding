package day007;

public class java_private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an = new Animal();
//		an.legs = 4;//飘红
		an.setLegs(4);
		an.getLegs();
	}

}

class Animal{
	private String name;
	private int legs;
	
	public void setLegs(int l){
		legs = l;
	}
	
	public int getLegs(){
		System.out.println(legs);
		return legs;
	}
}
