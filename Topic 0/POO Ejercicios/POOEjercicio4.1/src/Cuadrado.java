public class Cuadrado extends Rectangulo{
	
	
	public Cuadrado() {
		super(1, 1);
	}
	public Cuadrado(double lado) {
		super(lado, lado);
	}
	public Cuadrado(double lado, String color, boolean relleno) {
		super(lado, lado, color, relleno);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
