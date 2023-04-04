package curs5;
import java.util.*;
/*
 * Cerem utilizatorului 
 * numere pe care le aduna incontinuu
 * Userul introduce cate numere vrea
 * Cand vrea sa se opreasca el va introduce 0
 * O rezolvare cu for si una cu while
 * 
 * 
 * */

public class ForVersusWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForVersusWhile obj = new ForVersusWhile();
		//obj.rezolvareCuFor();
		//obj.rezolvareCuFor2();
		obj.rezolvareCuWhile();
		

	}
	
	public void rezolvareCuFor() {
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		
		for ( ; ; ) {
			System.out.println("Te rog  sa introduci un numar: ");
			int numar = scan.nextInt();
			if (numar == 0) {
				break;
			}
			
			total = total + numar;
		}
		System.out.println(total);
		
	}
	
	public void rezolvareCuFor2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog  sa introduci un numar: ");
		int total = 0;
		
		for (int numar = scan.nextInt(); numar != 0; numar = scan.nextInt()) {

			
			total = total + numar;
			System.out.println("Te rog  sa introduci un numar: ");
		}
		System.out.println(total);
		
	}
	
	public void rezolvareCuWhile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci numarul: ");
		int numar = scan.nextInt();
		int total = 0;
		
		while (numar != 0) {
			total += numar;
			System.out.println("Te rog sa introduci numarul: ");
			numar = scan.nextInt();
		}
		System.out.println(total);
	}

}
