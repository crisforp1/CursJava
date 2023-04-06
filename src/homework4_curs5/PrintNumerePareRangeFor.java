package homework4_curs5;
/*
 Scriem un program care intreaba utilizatorul 2 numere.
 Va printa doar numerele pare aflate intre acele 2 numere,
 folosind for
 */

import java.util.Scanner;

public class PrintNumerePareRangeFor {

	public static void main(String[] args) {

		Scanner inputUser = new Scanner(System.in);
		System.out.println("Te rog sa introduci primul numar: ");
		int numar1 = inputUser.nextInt();
		System.out.println("Te rog sa introduci al doilea numar: ");
		int numar2 = inputUser.nextInt();
		inputUser = null; // pentru gestionarea memoriei
		printNumerePare(numar1, numar2);

	}

	public static void printNumerePare(int primulNumar, int alDoileaNumar) {

		for (int i = primulNumar; i <= alDoileaNumar; i++) { // bucla for 
			if (i % 2 == 0) {
				System.out.print(i + " | "); // am printat numerele pare intr-o forma ordonata
			}
		}
	}

}