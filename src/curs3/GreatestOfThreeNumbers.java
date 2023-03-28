package curs3;
import java.util.*;
/*
 * facem un program care citeste de la tastatura 3 numere
 * verifica care dintre cele numere este mai mare si printeaza in consola
 * 
 * daca 2 numere sunt egale va printa "some numbers are equals"
 * 
 * */

public class GreatestOfThreeNumbers {
	
	int number1, number2, number3;
	
	public void askForThreeNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number1: ");
		number1 =scan.nextInt();
		System.out.println("Please enter number2: ");
		number2 =scan.nextInt();
		System.out.println("Please enter number3: ");
		number3 =scan.nextInt();
	}
	
	public void compareTheNumbers() {
		if (number1 > number2 && number1 > number3) { // si AND &&
			System.out.println("number1 is the greatest");
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("number2 is the greatest");
		} else if (number3 > number1 && number3 > number2) {
			System.out.println("number3 is the greatest");
		}else {
			System.out.println("some numbers are equals");
		}
	}

}
