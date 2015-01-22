public class Perro extends Animal {

	@Override
	public void saludo() {
		System.out.println("woof");
	}

	public void saludo(Perro otro) {
		System.out.println("wooooof!");
	}

}
