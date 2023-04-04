package curs5;

import java.util.*;

/*
 * un program care calculeaza salariul pe o saptamana
 * intrebam userul cate ore a lucrat
 * calculam doar daca numarul de ore este intre 1 si 40
 * daca numarul de ore este invalid il mai rugam sa-l
 * mai introduca o data pana introduce un numar de ore valid
 * 
 * 
 * 
 */
public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Cate ore ai lucrat saptamana aceasta?");
		int oreLucrate = scan.nextInt();
		int ratePerHour = 15;
//		while (oreLucrate >= 1 && oreLucrate <= 40) {
//			System.out.println("Salariul platit este: " + oreLucrate*ratePerHour);
//		}

		while (oreLucrate < 1 || oreLucrate > 40) {
			System.out.println("Te rog sa introduci un numar valid (intre 1 si 40 de ore)");
			oreLucrate = scan.nextInt();

		}

		System.out.println("Salariul platit este: " + oreLucrate * ratePerHour);

	}

}
