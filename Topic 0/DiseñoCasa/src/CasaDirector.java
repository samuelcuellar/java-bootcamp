public class CasaDirector {
	private CasaBuilder casaBuilder = null;

	// creo el director con el builder (clase q implementa la interfaz) como
	// parametro
	public CasaDirector(CasaBuilder casaBuilder) {
		this.casaBuilder = casaBuilder;
	}

	// aplico los metodos de la interfaz (los build y el get) para construir la
	// casa
	public void construirCasa() {
		casaBuilder.builBaños();
		casaBuilder.builDormitorios();
		casaBuilder.builCocina();
		casaBuilder.builSalas();
	}

	public Casa getCasa() {
		return casaBuilder.getCasa();
	}
}
