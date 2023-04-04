package curs5;

import java.util.*;

/*
 * cerem un string de la tatstatura
 * cautam in stringul respectiv daca contine litera A
 * daca o gasim printam "litera A este in test"
 * daca nu o gaim printam "litera A nu este in test"
 * printam de cate ori apare litera A
 * 
 */
public class LetterSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci un text: ");
		String text = scan.next();
		// System.out.println(text.length());
		int counter = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'A') {
				counter++;
				// ar fi fain cu break daca gasea prima litera A
			}
		}

		String result = counter > 0 ? "Litera A exista de " + counter + " ori" : "Litera A nu exista";
		System.out.println(result);

	}

}
