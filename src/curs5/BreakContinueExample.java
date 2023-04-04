package curs5;

public class BreakContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i == 5 ) {
				//break; // intrerupe executia
				continue; //face skip il arunca sus in bucla
			}
			System.out.println(i);
		}

	}

}
