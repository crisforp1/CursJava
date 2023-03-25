package curs2;

public class MethodJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 4;
		int width = 2;
		int roomArea = length * width;
		System.out.println( "Aria camerei este :" + roomArea);

		//System.out.println();
		int length2 = 6;
		int width2 = 3;
		int roomArea2 = length2 * width2;
		System.out.println( "Aria camerei este :" + roomArea2);

		System.out.println( "-----------------------------");
		
		MethodJava obj = new MethodJava();
		obj.calculateArea(4,4);
		obj.calculateArea(5,4);
		obj.calculateArea(4,5);
		
		System.out.println("Aria camerei este :" + 	obj.calculateArea(4,5));
		
		
	}
	
	
	
	public int calculateArea(int length, int width) {
		int roomArea = length * width;
		return roomArea;
		//System.out.println("Aria camerei este :" + roomArea);
		//logica de refolosire a metodei
		
	}


}
