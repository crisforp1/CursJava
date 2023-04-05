package homework4_curs5;

/*
 Folosind WHILE scriem un program care cere un numar de la
 tastatura si il printeaza inversat.
 Ex : daca userul introduce 1234 , vom printa 4321
 */

import java.util.Scanner;

public class NumarPalindrom {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		System.out.println("Te rog sa introduci un numar intreg: ");
		int numar = inputUser.nextInt();
		reverseNumber(numar);
	}

	public static void reverseNumber(int number) {
		int reversedNumber = 0;
		while (number > 0) {
			reversedNumber = reversedNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(reversedNumber);
	}
}
