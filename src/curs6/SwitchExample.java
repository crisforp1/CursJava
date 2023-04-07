package curs6;

import java.util.*;

//intreb userul un califictiv si printez 
//in functie de raspuns
//A--Felicitari
//B--Destul de bine
//C--Suficient
//D--Insuficient
//E--Calificativ invalid
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci un calificativ: ");
		String nota = scan.next();

		switch (nota.toUpperCase()) {
		case "A":
			System.out.println("Felicitari!");
			break;
		case "B":
			System.out.println("Destul de bine!");
			break;
		case "C":
			System.out.println("Suficient!");
			break;
		case "D":
			System.out.println("Insuficent!");
			break;
		default:
			System.out.println("Calificativ invalid!");

		}

	}

}
