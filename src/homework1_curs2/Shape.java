package homework1_curs2;

/*
   In clasa Shape avem 2 metode :
   calculateSquareArea (care calculeaza aria unui patrat cu formula
   length * length) si calculateRectangleArea (care calculeaza aria
   unui dreptunghi cu formula length*width)
   
   Avem 3 constructori :
   Unul care primeste ca parametru length si executa metoda
   calculateSquareArea
   Unul care primeste ca parametru length si width si executa metoda
   calculateRectangleArea
   Unul care primeste ca parametru o variabila double care se
   cheama radius (raza cercului) si care calculeaza aria unui cerc cu formula
   radius*radius*Math.PI
   
   Numarul metodelor trebuie sa fie 2
   Numarul contructorilor trebuie sa fie 3
 */

public class Shape {

	public void calculateSquareArea(int length) {
		System.out.println("The area of the square is :" + length * length);

	}

	public void calculateRectangleArea(int length, int width) {
		System.out.println("The area of the rectangle is :" + length * width);
	}

	public Shape(int length) {
		calculateSquareArea(length);
	}

	public Shape(int length, int width) {
		calculateRectangleArea(length, width);
	}

	public Shape(double radius) {
		// Nu am stiut exact cum sa folosesc Math.PI
		System.out.println("The area of the circle is :" + radius * radius * 22 / 7);
	}

}
