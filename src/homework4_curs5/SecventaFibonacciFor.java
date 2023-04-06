package homework4_curs5;
/*
  Scriem o secventa de numere Fibonacci
  folosind o structura while
 */

import java.util.*;

public class SecventaFibonacciFor {

	public static void main(String[] args) {

		int numar, predecesor = 0, succesor = 1, suma;
		Scanner scan = new Scanner(System.in);
		System.out.print("Te rog sa introduci valoarea numarului: ");
		numar = scan.nextInt();
		System.out.print("Seria Fibonacci pentru " + numar + " numere este: ");
		scan = null; // pentru gestionarea memoriei

		System.out.print(0 + " " + 1 + " ");
		for (int i = 2; i < numar; i++) {
			suma = predecesor + succesor;
			predecesor = succesor;
			succesor = suma;
			System.out.print(suma + " ");
		}

	}

}
