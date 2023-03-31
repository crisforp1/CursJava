package curs4;
import java.util.*;
// facem un calculator simplu pentru operatiile de baza
//(+) adunare

//intebam user numarul 1
//intrebam operatorul care vrea sa-l introduca
//
public class SimpleCalculator {
	int num1, num2, result;
	char operator;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu primul nr: ");
		num1 = scan.nextInt();
		System.out.println("Introdu operatorul: ");
		operator = scan.next().charAt(0);
		System.out.println("Introdu al doilea nr: ");
		num2 = scan.nextInt();
		
	}
	
	public void calculateValues() {
		askTheUser();
		if(operator == '+') {
			result = num1 + num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		} else if (operator == '-') {
			result = num1 - num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		} else if (operator == '*' || operator == 'x') {
			result = num1 * num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}  else if (operator == '/' || operator ==':') {
			result = num1 / num2;
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		} else {
				System.out.println("Te rog sa introduci doar unul din cele 4 simboluri");
				}
		}
		
	}


