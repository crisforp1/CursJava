package curs6;
//parola trenuie sa contina cel putin 10 caractere

//parola trebuie sa contina o litera uppercase
//parola nu trebuie sa fie ca username

//intrebam username-ul si parola
//intrebam userul care sunt regulile parolei

//validam parola--> daca e atunci parola valida!

//spargem programul in cat mai multe metode
//folosim un do while pentru logica de validare

//metode intrebam username si parola
//printam regulile
//validam parola
import java.util.*;

public class PasswordValidator {

	String username;
	//String password;
	boolean valid;
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordValidator obj = new PasswordValidator();
		obj.printPasswordRules();
		obj.askCredentials();
		//obj.checkPasswordRules();
		
		do {
			obj.checkPasswordRules(obj.getPassword());
		} while (!obj.valid);
			
			System.out.println("Parola valida!");
			
	}

	public void printPasswordRules() {
		System.out.println("Reguli parola: ");
		System.out.println("1. parola trebuie sa contina cel putin 10 caractere ");
		System.out.println("2. parola trebuie sa contina o litera uppercase");
		System.out.println("3. parola nu trebuie sa fie ca username");

	}

	public void askCredentials() {
		System.out.println("Te rog sa introduci usernameul: ");
		username = scan.next();
	}
	
	public String getPassword() {
		System.out.println("Te rog sa introduci password: ");
		String password = scan.next();
		return password;
	}
	

	public void checkPasswordRules(String password) {
		valid = true;
		if (password.length() < 10) {
			valid = false;
			System.out.println("Parola trebuie sa aiba cel putin 10 caractere");
		}

		if (password.equals(password.toLowerCase())) {
			valid = false;
			System.out.println("Parola trebuie sa contina cel putin o litera uppercase");
		}

		if (password.equalsIgnoreCase(username)) {
			valid = false;
			System.out.println("Username si password nu trebuie sa fie la fel");
		}

	}

}
