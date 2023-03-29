package homework2_curs3;

/*
  

 In clasa Car avem 3 variabile statice :
 brand
 type
 engine
 Avem 1 constructor :
 Primeste 2 parametri : brand si engine si seteaza 
 valorile primite in variabilele cu acelasi nume
 Type are valoarea “Suv”
 Avem 1 metoda statica care se chema carDetails si care returneaza un String cu
 urmatorul format :
"All " +brand + " cars are "+ engine + " and are of type " + type;

 */

public class Car {
	public static String brand;
	public static String type;
	public static int engine;
	
	public Car(String brand, int engine) {
		Car.brand = brand;
		setEngine(engine);
		setType("Suv");
	}

	
	public static void setType(String type) {
		Car.type = type;
	}

	public static void setEngine(int engine) {
		Car.engine = engine;
	}
	
	public static String carDetails() {
		return "All " + brand + " cars are "+ engine + " and are of type " + type;
	}
	

}
