class Rectangle{
	int width;
	int length;
	
	void round(int myWidth, int myLength){
	int myRound = (myWidth+myLength) * 2;
	System.out.println("周长是："+ myRound);
    }
	
	void area(int myWidth, int myLength){
		int myArea = myWidth * myLength;	
		System.out.println("面积是："+ myArea);
	}
}

class TestRectangleMessage{
	public static void main(String[] args){
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		//赋值长宽
		rect1.width = 5;
		rect2.width = 4;
		rect1.length = 5;
		rect2.length = 3;
		
	
		rect1.round(rect1.width, rect1.length);
		rect2.round(rect2.width, rect2.length);
		
		rect1.area(rect1.width, rect1.length);
		rect2.area(rect2.width, rect2.length);
	}
}

