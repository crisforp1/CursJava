package homework2_curs3;

/*
In clasa TestCar in metoda main vom avea dupa cum urmeaza:
Un obiect care va chema constructorul
Un print care va chema obiect.carDetails
Un obiect nou (obiect2) care va chema constructorul
Vom schimba valoarea variabilei type in “sedan”
Un print care va chema obiect2.carDetails
Un print care va chema obiect.carDetails 

 */
public class TestCar {

	public static void main(String[] args) {
		Car obiect = new Car("VW", 2000);
		System.out.println(obiect.carDetails());
		System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");

		Car obiect2 = new Car("Hyundai", 3000);
		obiect2.setType("sedan");

		System.out.println(obiect2.carDetails());

		System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");

		System.out.println(obiect.carDetails());

		/*
		 * Nota: 
		 * 1. Dupa rulare vom avea 3 printuri in consola. 
		 * 2. Sunt corecte conform executiei din TestCar? 
		 * 
		 * Banuiesc ca are legatura cu variabilele statice si cu
		 * metoda statica carDetails() din clasa Car. Nu imi este clar daca sunt sau nu
		 * corecte rezultatele celor 3 printuri din clasa TestCar!
		 * 
		 */

	}

}
