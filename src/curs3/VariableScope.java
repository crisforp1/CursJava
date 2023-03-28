package curs3;

public class VariableScope {
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	public String nume = "Oana"; //variabila de instanta
	public static String culoare = "alb";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(nume); //nu functioneaza
		VariableScope obj = new VariableScope();
		System.out.println(culoare);
		String prenume = "Ion";
		System.out.println(obj.nume);
		
		System.out.println(prenume);
	}
	
	public void printeazaSalut() {
		s
		
	}

}
