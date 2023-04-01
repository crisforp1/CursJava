package homework3_curs4;
/*
 	Homework. Ex 1 – Ternary Operator
 
	 Scriem un program care aplica un discount unei facturi.
	 Daca factura este mai mare decat 100 aplica un dsicount de 10%
	 Daca factura este mai mica decat 100 aplica un discount de 5%
	 Printam rezultatul
 
 */

public class DiscountFactura {

	public static void main(String[] args) {

		double amountInvoice = 1000;
		String discount = (amountInvoice > 100) ? "Ai un discount de 10%: " + 0.1 * amountInvoice
				: "Ai un discount de 5%: " + 0.05 * amountInvoice;
		System.out.println(discount);

		// Pentru valoarea facturii de 1000, discountul primit va fi de 100.0;
		// Pentru valoarea facturii de 50, discountul primit va fi de 2.5;
		// Se putea citi de la tastatura in mod dinamic valoarea variabilei de tip double amountVoice;

	}

}
