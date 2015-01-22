public class Circulo {
	private double radio;
	private String color;

	// constructores
	public Circulo() { // por defecto
		this.radio = 1;
		this.color = "rojo";
	}

	public Circulo(double radio) {
		this.radio = radio;
		this.color = "rojo";
	}

	// getters
	public double getRadio() {
		return radio;
	}

	public String getColor() {
		return color;
	}

	// setters
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// calculo del area
	public double getArea() {
		return radio * radio * Math.PI;
	}

	// toString

	public String toString() {
		   return "Circulo: radio=" + radio + " color=" + color;
	}
}
