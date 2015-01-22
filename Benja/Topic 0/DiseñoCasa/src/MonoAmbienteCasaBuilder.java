public class MonoAmbienteCasaBuilder implements CasaBuilder {

	private Casa casa;

	public MonoAmbienteCasaBuilder() { // constructor por defecto
		casa = new Casa();
	}

	// tipo de casa
	@Override
	public void builBaños() {
		casa.setBaños(1);
	}

	@Override
	public void builDormitorios() {
		casa.setDormitorios(1);
	}

	@Override
	public void builSalas() {
		casa.setSalas(0);
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
