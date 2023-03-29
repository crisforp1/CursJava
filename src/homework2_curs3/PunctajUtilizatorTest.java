package homework2_curs3;

import java.util.*;

public class PunctajUtilizatorTest {
	/*
	 * 
	 * Homework. Ex 3 – if else Scriem un program care intreaba utilizatorul
	 * punctajul unui test. Daca utilizatorul introduce o valoare intre 0 si 65
	 * atunci printeaza ”Ai picat. Mai incearca” Daca utilizatorul introduce o
	 * valoare mai mare sau egala cu 66 atunci printeaza ”Felicitari, Ai trecut”
	 * 
	 */

	public static int pointsTest;

	public static void main(String args[]) {
		askPointsTest();
		decidePassedTest();
	}

	public static void askPointsTest() {
		System.out.println("Introdu punctajul testului: ");
		Scanner input = new Scanner(System.in);
		pointsTest = input.nextInt();
	}

	public static void decidePassedTest() {
		if (pointsTest >= 0 && pointsTest <= 65) {
			System.out.println("Ai picat. Mai incearca");
		} else {
			System.out.println("Felicitari, Ai trecut");
		}

	}

}
