package curs3;

public class StaticVsNonStatic {

	public static String nume;
	public static String departament = "QA";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nume);
		
		System.out.println(departament);
		
		System.out.println("_ _ _ _ _ _");
		
		StaticVsNonStatic person = new StaticVsNonStatic();
		person.nume = "Johnny";
		System.out.println(person.nume + departament);
		
		System.out.println("_ _ _ _ _ _");
		
		StaticVsNonStatic person = new StaticVsNonStatic();
		person.nume = "Ioana";
		System.out.println(person.nume + departament);
		
		
		

	}

}
