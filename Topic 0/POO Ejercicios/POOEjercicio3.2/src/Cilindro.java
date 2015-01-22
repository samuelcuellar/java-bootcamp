
public class Cilindro {
	private Circulo base;	//por composicion los constructores se hacen mas complejos y tenes q
	private double altura;
	
	public Cilindro(int i, double altura){
		this.setBase(new Circulo(i));
		this.setAltura(altura);
	}

	public Circulo getBase() {
		return base;
	}

	public void setBase(Circulo base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getArea(){
		return 2* Math.PI * base.getArea() * altura + 2 * base.getArea();
	}

	public double getVolumen() {
		return base.getArea() * altura;
	}

	public String toString() {
		return base.toString() + " altura=" + altura;
	}
}
