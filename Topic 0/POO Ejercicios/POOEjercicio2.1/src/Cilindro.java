public class Cilindro extends Circulo {
	private double altura;

	public double getAltura() {
		return altura;
	}

	public Cilindro() {// por defecto: rojo, de 1x1
		super();
		altura = 1;
	}

	public Cilindro(double altura) {// circulo por defecto y altura dada
		super();
		this.altura = altura;
	}

	public Cilindro(double radio, double altura) {
		super(radio);
		this.altura = altura;
	}

	public double getArea() {
		return 2 * Math.PI * super.getRadio() * altura + 2 * super.getArea();
	}

	public double getVolumen() {
		return super.getArea() * altura;
	}

	public String toString() {
		return super.toString() + " altura=" + altura;
	}
}
