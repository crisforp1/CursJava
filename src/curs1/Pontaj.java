package curs1;

public class Pontaj {

	public static void main(String[] args) {

		Angajat ang1 = new Angajat(); 
		ang1.nume = "Oana";
		ang1.departament = "HR";   //accesarea membrilor clasei
		
		Angajat ang2 = new Angajat();
		ang2.nume = "Sorin";
		ang2.departament = "Programare";
		
		System.out.println(ang2.nume);
	}

}
