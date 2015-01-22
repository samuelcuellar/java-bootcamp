public class Prueba {
	public static void main(String[] args) {
		
		 Forma c = new Circulo(3.4,"Verde",true); 
		 System.out.println(c);
		 System.out.println("Area= "+c.getArea());
		 System.out.println("Perimetro= "+c.getPerimetro());
		 //System.out.println("Radio= "+c.getRadio());
		  
		 Circulo c1 = (Circulo)c; System.out.println(c1.getColor());
		  
		 //Forma f = new Forma(); //las clases abstractas no se pueden inicializar
		 
		 Forma r = new Rectangulo(3,2); 
		 System.out.println(r);
		 
		 Cuadrado cuadrado1 = new Cuadrado(3.2);
		 System.out.println(cuadrado1);
		 System.out.println("Area= "+cuadrado1.getArea());
		 System.out.println("Perimetro= "+cuadrado1.getPerimetro());
		 
		/*
		Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
		System.out.println(s1); // which version?
		System.out.println(s1.getArea()); // which version?
		System.out.println(s1.getPerimeter()); // which version?
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		System.out.println(s1.getRadius());

		Circle c1 = (Circle) s1; // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());

		Shape s2 = new Shape();

		Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		System.out.println(s3.getLength());

		Rectangle r1 = (Rectangle) s3; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());

		Shape s4 = new Square(6.6); // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		System.out.println(s4.getSide());

		// Take note that we downcast Shape s4 to Rectangle,
		// which is a superclass of Square, instead of Square
		Rectangle r2 = (Rectangle) s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getSide());
		System.out.println(r2.getLength());

		// Downcast Rectangle r2 to Square
		Square sq1 = (Square) r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
		*/
		//en el enunciado principal hay problemas con las instrucciones getLargo, por ejemplo, por la forma de instanciar: Forma r = new Rectangulo();
		//luego si se saca esos, no se puede hacer el upcast
	}
}
