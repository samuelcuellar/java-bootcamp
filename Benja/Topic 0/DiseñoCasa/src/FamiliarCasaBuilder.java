public class FamiliarCasaBuilder implements CasaBuilder {

	private Casa casa;

	public FamiliarCasaBuilder() { // constructor por defecto
		casa = new Casa();
	}

	// tipo de casa
	@Override
	public void builBaños() {
		casa.setBaños(1);
	}

	@Override
	public void builDormitorios() {
		casa.setDormitorios(2);
	}

	@Override
	public void builSalas() {
		casa.setSalas(1);
	}

	@Override
	public void builCocina() {
		casa.setCocina("simple");
	}

	// devolver el tipo de casa
	@Override
	public Casa getCasa() {
		return casa;
	}
}