package curs3;

import java.util.Scanner;

/*
 * Program care verific daca nr este par sau impar
 * citim de la tastatura
 * daca nr este par printam "numarul este par"
 * daca nr este impar printam "numarul este impar"
 * */
public class ParSauImpar {
	public int number; //variabila globala


		public void askTheNumber() {
			System.out.println("Please enter a number: ");
			Scanner scan = new Scanner(System.in);
			number = scan.nextInt();
		}
		
		public void checkNumber() {
			// % modulo operator
			//== operator de egalitate
			if (number % 2 == 0) {
				System.out.println("numarul este par");
				
			} else {
				System.out.println("numarul este impar");
			}
			
		}

	

}
