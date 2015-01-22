public class PerroGrande extends Perro {
	@Override
	public void saludo() {
		System.out.println("WOOF");
	}
	public void saludo(PerroGrande otro) {
		System.out.println("WOOOOOOOFFF");
	}
}
