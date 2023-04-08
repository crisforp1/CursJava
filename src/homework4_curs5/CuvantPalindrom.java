package homework4_curs5;
/*
    Folosind un FOR scriem un program care verifica daca un cuvant este
	Palindrom.
	Un palindrom este un șir de caractere (de obicei cuvinte, fraze sau
	numere) care citit de la stânga la dreapta sau de la dreapta la stânga
	rămâne neschimbat
	Ex : radar (daca citim de la final , tot acelasi inteles are)
 */

import java.util.*;

public class CuvantPalindrom {

	public static void main(String[] args) {

		Scanner inputUser = new Scanner(System.in);
		System.out.println("Te rog sa introduci un cuvant: ");
		String cuvant = inputUser.nextLine();
		cuvantPalindrom(cuvant);
	}

	public static void cuvantPalindrom(String word) {
		String reversedWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord += word.charAt(i);
		}

		if (word.equals(reversedWord)) {
			System.out.println(word + " is a palindrom.");
		} else {
			System.out.println(word + " is not a palindrom.");
		}

	}

	/*
	 * public static void cuvantPalindrom(String word) { //solutia trainerului
	 * 
	 * boolean isPalindrom = true;
	 * 
	 * for (int i = word.length() - 1; i >= 0; i--) {
	 * 
	 * if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
	 * 
	 * isPalindrom = false;
	 * 
	 * break;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * if (isPalindrom) {
	 * 
	 * System.out.println(word + " este un palindrom.");
	 * 
	 * } else {
	 * 
	 * System.out.println(word + " nu este un palindrom.");
	 * 
	 * }
	 * 
	 * }
	 */

}
