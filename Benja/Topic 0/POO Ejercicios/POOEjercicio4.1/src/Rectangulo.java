public class Rectangulo extends Forma{
	private double ancho;
	private double largo;
	
	public Rectangulo() {
		super();
		this.ancho = 1;
		this.largo = 1;
	}
	public Rectangulo(double ancho, double largo) {
		super();
		this.ancho = ancho;
		this.largo = largo;
	}
	public Rectangulo(double ancho, double largo, String color, boolean relleno) {
		super(color,relleno);
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	//implementaciones
	@Override
	double getArea() {
		return ancho * largo;
	}
	@Override
	double getPerimetro() {
		return 2 * ancho + 2 * largo;
	}
	@Override
	public String toString() {
		String a = "Rectangulo: ";
		if(largo==ancho){
			a= "Cuadrado: ";
		}
		return a + "Largo= " + largo + ", Ancho= " + ancho + ", "+super.toString();
	}
	
}
