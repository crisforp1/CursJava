package homework5_curs6;

import java.util.Scanner;

public class UserAutentication3Attempts {

	public static void main(String[] args) {

		String utilizInput;

		String parolaInput;

		int nrIncercari = 3;

		Scanner inputScanner = new Scanner(System.in);

		/*
		 * System.out.println("Please enter user: ");
		 * 
		 * utilizInput = inputScanner.nextLine();
		 * 
		 * System.out.println("Please enter password: ");
		 * 
		 * parolaInput = inputScanner.nextLine();
		 * 
		 * Fara aceste 4 linii de cod la recomandarea trainerului
		 * 
		 */

		do {

			System.out.println("Please enter user: ");

			utilizInput = inputScanner.nextLine();

			System.out.println("Please enter password: ");

			parolaInput = inputScanner.nextLine();

			if ("TestUser".equals(utilizInput) && "1234".equals(parolaInput)) {

				System.out.println("Login Sucessful");

				break;

			} else {

				System.out.println("Login Error");

				nrIncercari--;

			}

		} while (nrIncercari != 0);

		if (nrIncercari == 0) {

			System.out.println("Maximum attempts reached. User blocked");

		}

	}
}
