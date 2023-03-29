package curs3;

public class VariableScope {
	/*
	 * 1. compileaza
	 * 2. le incarca in jvm
	 * 3. cauta membrii statici (var sau metode care au definit in declaratia lor
	 *    cuvantul static)
	 * ...
	 * ...
	 * 4. instantiaza obiecte 
	 *  
	 */

	
	
	public String nume = "Oana"; //variabila de instanta
	public static String culoare = "alb";

	public static void main(String[] args) {
		
		//System.out.println(nume); //nu functioneaza
		VariableScope obj = new VariableScope();
		
		System.out.println(culoare);
		
		obj.printeazaSalut();
		
		String prenume = "Ion";
		
		System.out.println(obj.nume);
		
		System.out.println(prenume);
	}
	
	public void printeazaSalut() {

		System.out.println("Salut " + nume);

	}
	
}
