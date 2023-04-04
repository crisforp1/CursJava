package homework3_curs4;

import java.util.Scanner;

public class CalificativPunctaj {
	/*
	 * Homework. Ex 3 – Ternary Operator
	 * 
	 * Scriem un program care intreaba utilizatorul un punctaj. Daca utilizatorul
	 * introduce o valoare mai mare sau egala cu 90 ii atribuim FB Daca utilizatorul
	 * introduce o valoare mai mare sau egala cu 80 ii atribuim B Daca utilizatorul
	 * introduce o valoare mai mica decat 80 ii atribuim S Daca a luat calificativ
	 * FB printam : “Ai primit : FoarteBine” Daca a luat calificativ B printam : “Ai
	 * primit : Bine” Daca a luat calificativ S printam : “Ai primit : Suficient”
	 * 
	 */

	int userPoints;

	public void askUserPoints() {
		Scanner inputUser = new Scanner(System.in);
		System.out.println("Ce punctaj ai obtinut?");
		userPoints = inputUser.nextInt();
	}

	public void userCalificativ() {
		askUserPoints();
		String checkUserCalificativ = (userPoints >= 90) ? "FoarteBine" : (userPoints >= 80) ? "Bine" : "Suficient";
		System.out.println("Ai primit: " + checkUserCalificativ);
	}

// Varianta domnului instructor

//	public void userCalificativ() { 
//
//		askUserPoints();
//
//		String checkUserCalificativ = (userPoints >= 90) ? "FB" : (userPoints >= 80) ? "B" : "S";
//
//		String printMessage = checkUserCalificativ.equals("FB") ? "FoarteBine"
//				: checkUserCalificativ.equals("B") ? "Bine" : "Suficient";
//
//		System.out.println("Ai primit: " + printMessage);
//
//	}

}
