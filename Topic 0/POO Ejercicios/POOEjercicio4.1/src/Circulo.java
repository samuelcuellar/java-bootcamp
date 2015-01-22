public class Circulo extends Forma{
	private double radio;

	public Circulo() {
		super();
		this.radio = 1.0;
	}
	public Circulo(double radio) {
		super();
		this.setRadio(radio);
	}
	public Circulo(double radio, String color, boolean relleno) {
		super(color,relleno);
		this.setRadio(radio);
	}
	//getter and setter
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	double getArea() {
		return radio * radio * Math.PI;
	}
	@Override
	double getPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	@Override
	public String toString() {
		return "Circulo: Radio= "+radio+ ", "+super.toString();
	}
	
}
