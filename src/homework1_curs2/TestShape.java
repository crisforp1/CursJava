package homework1_curs2;

/*
In clasa TestShape doar vom instantia in metoda main 3 obiecte
care se vor chema : patrat, dreptunghi si cerc

La rezultat ne asteptam sa printeze in consola :
The area of the square is : < rezultat >
The area of the rectangle is : <rezultat>
The area of the circle is : < rezultat >

In TestShape nu avem metoda de System.out.print....
nu avem variabile la nivel de clasa in nici una dintre clase
nu avem getters si setters pt ca nu avem variabile la nivel de clasa

 */
public class TestShape {

	public static void main(String[] args) {
		Shape patrat = new Shape(8);
		Shape dreptunghi = new Shape(4, 2);
		Shape cerc = new Shape(3.0);
	}
}
