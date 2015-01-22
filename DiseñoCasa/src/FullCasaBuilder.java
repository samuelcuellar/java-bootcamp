public class FullCasaBuilder implements CasaBuilder {

	private Casa casa;

	public FullCasaBuilder() { // constructor por defecto
		casa = new Casa();
	}
	//tipo de casa
	@Override
	public void builBaños() {
		casa.setBaños(2);
	}

	@Override
	public void builDormitorios() {
		casa.setDormitorios(3);
	}

	@Override
	public void builSalas() {
		casa.setSalas(1);
	}

	@Override
	public void builCocina() {
		casa.setCocina("comedor");
	}
	//devolver el tipo de casa
	@Override
	public Casa getCasa() {
		return casa;
	}
}	