package curs6;

import java.util.*;

//joc de zaruri cu urmatoarele reguli
//daca userul da un total 2, 6 si 12 atunci pierde jocul(printam un mesaj)
//daca userul da un total 7, 11 atunci castiga jocul (printam un mesaj)
//daca userul are un total de 3, 10 atunci repeta aruncarea
//in alte situatii il intrebam pe user daca vrea sa mai dea o data, raspunsul va fi de data boolean//
//daca zice true mai da o data , daca nu se termina jocul

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean conditie = true;
		
		while (conditie) {
			int dice1 = (int) (Math.random() * 6 + 1);
			int dice2 = (int) (Math.random() * 6 + 1);
			// System.out.println(dice1);
			int total = dice1 + dice2;

			if (total == 2 || total == 6 || total == 12) {
				System.out.println("Imi pare rau! Ai dat " + total + " Ai pierdut!");
				break;
			} else if (total == 7 || total == 11) {
				System.out.println("Bravo! Ai dat " + total + "Ai castigat!");
				break;
			} else if (total == 3 || total == 10) {
				System.out.println("Ai dat " + total + "Mai da o data!");
			} else {
				System.out.println( "Ai dat " + total + " Mai vrei sa dai o data?");
				Scanner scan = new Scanner(System.in);
				conditie = scan.nextBoolean();

			}
		}
		System.out.println("Game over!");

	}

}
