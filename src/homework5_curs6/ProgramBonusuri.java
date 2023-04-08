package homework5_curs6;

import java.util.Scanner;
/*
Scriem un program care simuleaza un program de acordat bonusuri.
Programul primeste input de la utilizator :
Anul de vechime in firma
Valoarea vanzarilor efectuate
Luna in care a efectuat vanzarile

Daca are un an vechime atunci primeste un bonus de 100
Daca are 2 ani vechime atunci primeste un bonus de 200
Daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala cu
5000 atunci primeste bonus 600
Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
vanzarile au fost efectuate in oricare din lunile 1-6 primeste bonus 800
 Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
vanzarile au fost efectuate in oricare din lunile 7-11 primeste bonus 1000
Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
vanzarile au fost efectuate in luna 12 primeste bonus 900 si mesajul : “In
decembrie se vand singure!”
Daca are 3 ani si valoarea vanzarilor este mai mare decat 10000 primeste
bonus 1200
 */

public class ProgramBonusuri {
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		ProgramBonusuri objBonusuri = new ProgramBonusuri();
		objBonusuri.checkConditions();
	}

	public void checkConditions() {

		System.out.println("Te rog sa introduci cati ani de vechime ai (1, 2 sau 3): ");
		int nrAniVechime = in.nextInt();

		// in = null;

		if (nrAniVechime == 3) {

			System.out.println("Care este valoarea vanzarilor pe care le-ai efectuat? ");
			int valVanzari = in.nextInt();
			System.out.println("In ce luna ai realizat vanzarile? (1 - 12):");
			int lunaDeVanzari = in.nextInt();

			if (valVanzari <= 5000) {
				System.out.println("Primesti bonus 600");

			} else if (valVanzari <= 10000) {
				switch (lunaDeVanzari) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6: {

					System.out.println("Primesti bonus 800");
					break;
				}
				case 7:
				case 8:
				case 9:
				case 10:
				case 11: {

					System.out.println("Primesti bonus 1000");
					break;
				}
				case 12: {
					System.out.println("Primesti bonus 900");
					System.out.println("In decembrie se vand singure!");
					break;
				}
				default: {
					System.out.println("Aceasta este o valoare neasteptata: " + lunaDeVanzari
							+ " Este musai sa te incadrezi de la 1 pana la 12!");
				}
				}

			} else if (valVanzari > 10000) {
				System.out.println("Primesti bonus 1200");
			}

		}

		if (nrAniVechime == 2) {
			System.out.println("Primesti bonus 200");
		}

		if (nrAniVechime == 1) {
			System.out.println("Primesti bonus 100");
		}

		if (nrAniVechime != 1 && nrAniVechime != 2 && nrAniVechime != 3) {
			System.out.println("Vei avea parte de o surpiza!");
		}

	}

}
