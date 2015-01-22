
public class PruebaCirculo {
	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		
		Circulo c2 = new Circulo(2);
		
		Circulo c3 = new Circulo();
		c3.setColor("azul");
		c3.setRadio(5);
		
		System.out.println(c1+ ", Area: "+c1.getArea());
		System.out.println(c2+ ", Area: "+c2.getArea());
		System.out.println(c3+ ", Area: "+c3.getArea());
	}
}
