package curs4;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 80;
		int b = 135;
		
		int x;
		
		if (a > b) {
			x = a;
		} else {
			x = b;
		}
		System.out.println(x);
		
		int y = (a > b) ? a : b;
		System.out.println(y);
		
		//=================
		
		int num1 = 2;
		int num2 = 8;
		int num3 = 10;
		
		int z = (num1 > num2) ? num1 : (num2 > num3) ? num2 : num3;
		
		System.out.println(z);
	}
	
	
	
	

}
