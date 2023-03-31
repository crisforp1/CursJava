package homework2_curs3;

import java.util.*;

public class VarstaUtilizatorAdult {
	/*
	 * 
	 * Homework. Ex 2 – if else Scriem un program care intreaba utilizatorul ce
	 * varsta are. Daca utilizatorul introduce o valoare sub 18 , printeaza ”Esti
	 * minor” Daca utilizatorul introduce o valoare intre 18 si 65, printeaza ”Esti
	 * adult” (conditii multiple deci folosim if ((conditie 1)&&(conditie 2))) Daca
	 * utilizatorul introduce o valoare peste 65 , printeaza ”Esti batran”
	 * 
	 */

	public static int age;

	public static void main(String args[]) {
		askAgeUser();
		decideAdultOrNot();
	}

	public static void askAgeUser() {
		System.out.println("Ce varsta ai? ");
		Scanner input = new Scanner(System.in);
		age = input.nextInt();
	}

	public static void decideAdultOrNot() {
		if (age > 0 && age < 18) {
			System.out.println("Esti minor");
		} else if (age >= 18 && age <= 65) {
			System.out.println("Esti adult");
		} else if (age > 65) {
			System.out.println("Esti batran");
		} else {
            System.out.println("Varsta invalida!");
       }

	}

}
