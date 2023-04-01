package curs4;

import java.util.Scanner;

public class ConditionalOperator {

	// Facem un program care citeste doua numere de la tastatura
	// si verifica daca fiecare numar este pozitiv
	// daca ambele numere sunt pozitive
	// care dintre cele doua numere este cel mai mic sau daca sunt egale

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		num2 = scan.nextInt();

		// verific daca primul numar este pozitiv

		if (num1 > 0) {
			System.out.println("Primul numar este pozitiv");
		} else {
			System.out.println("Primul numar este negativ");
		}

		String result = (num1 > 0) ? "Primul numar este pozitiv" : "Primul numar este negativ";
		System.out.println(result);

		if (num2 > 0) {
			System.out.println("Al doilea numar este pozitiv");
		} else {
			System.out.println("Al doilea numar este negativ");
		}

		String result2 = (num2 > 0) ? "Al doilea numar este pozitiv" : "Al doilea numar este negativ";
		System.out.println(result2);

		// verific daca ambele sunt pozitive

		if (num1 > 0 && num2 > 0) {
			System.out.println("Ambele numere sunt pozitive");
		} else {
			System.out.println("Cel putin un numar din cele doua este negativ");
		}

		// sa fac ternarul
		String result3 = (num1 > 0 && num2 > 0) ? "Ambele numere sunt pozitive"
				: "Cel putin un numar din cele doua este negativ";
		System.out.println(result3);

		if (num1 > num2) {
			System.out.println("Number num1 is the greatest");
		} else if (num1 < num2) {
			System.out.println("Number num2 is the greatest");
		} else {
			System.out.println("Numbers are equals");
		}

		result = (num1 > num2) ? "Number num1 is the greatest"
				: (num1 < num2) ? "Number num2 is the greatest" : "Numbers are equals";

		System.out.println(result);

	}

}
