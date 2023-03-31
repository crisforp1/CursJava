package curs4;

public class IncrementDecrement {

	public static void main(String[] args) {
			//increment
		   // nr++ --> nr = nr + 1 --> nr += 1
		
		//nr++ --> Post increment
		
		//++nr --> Pre increment
		
		System.out.println("===POST===");
		int num = 10;
		
		System.out.println("Valoarea lui num inainte de increment " + num);
		System.out.println("Valoarea lui num in Post increment " + num++); //DUPA executie
		System.out.println("Valoarea lui num dupa increment " + num);
		
		System.out.println("===PRE===");
		int num2 = 17;
		
		System.out.println("Valoarea lui num2 inainte de increment " + num2);
		System.out.println("Valoarea lui num2 in pRE increment " + ++num2); //INAINTE executie
		System.out.println("Valoarea lui num2 dupa increment " + num2);
		
		
		
	}

}
