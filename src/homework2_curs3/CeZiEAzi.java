package homework2_curs3;

import java.util.*;

public class CeZiEAzi {

	/*
	 * Scriem un program care intreaba utilizatorul ce zi este astazi. Utilizatorul
	 * trebuie sa introduca un numar de la 1 -7 Daca introduce zero – printam “Te
	 * rog sa introduci un numar mai mare ca 0” Daca introduce 1 – printam “Astazi
	 * este luni” Daca introuce 2 – Printam ”Astazi este marti” Si tot asa pana
	 * duminica Daca introduce un numar mai mare ca 7 printam : ”Saptamana
	 * 
	 */

	public static int number;

	public static void main(String args[]) {
		askNumberUser();
		decideDayWeek();
	}

	public static void askNumberUser() {
		System.out.println("Introdu un numar de la 1 la 7:");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
	}

	public static void decideDayWeek() {
		 if (number <= 0 || number >= 8) {
             System.out.println("Te rog sa introduci un numar mai mare ca 0 sau mai mic ca 8");
		} else if (number == 1) {
			System.out.println("Astazi este luni");
		} else if (number == 2) {
			System.out.println("Astazi este marti");
		} else if (number == 3) {
			System.out.println("Astazi este miercuri");
		} else if (number == 4) {
			System.out.println("Astazi est joi");
		} else if (number == 5) {
			System.out.println("Astazi este vineri");
		} else if (number == 6) {
			System.out.println("Astazi este sambata");
		} else if (number == 7) {
			System.out.println("Astazi este duminica");
		}

	}

}
