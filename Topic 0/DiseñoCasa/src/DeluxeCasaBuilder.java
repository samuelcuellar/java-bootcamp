public class DeluxeCasaBuilder implements CasaBuilder {

	private Casa casa;

	public DeluxeCasaBuilder() { // constructor por defecto
		casa = new Casa();
	}

	// tipo de casa
	@Override
	public void builBa�os() {
		casa.setBa�os(3);
	}

	@Override
	public void builDormitorios() {
		casa.setDormitorios(4);
	}

	@Override
	public void builSalas() {
		casa.setSalas(2);
	}

	@Override
	public void builCocina() {
		casa.setCocina("comedor");
	}

	// devolver el tipo de casa
	@Override
	public Casa getCasa() {
		return casa;
	}
}