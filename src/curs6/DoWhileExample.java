package curs6;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"zero", "unu", "doi", "trei"};
						//	0       1      2       3
		int i = 0;
		while(i < array.length) {
			System.out.println(array[i]);
			i++;
		}
		
		System.out.println("================================");
		int j = 0;
		do {
			System.out.println(array[j]);
			j++;
		} while (j > array.length);
		
	}
	
}