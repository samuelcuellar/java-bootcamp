public class HospitalDirector {
	private HospitalBuilder hospitalBuilder = null;

	// creo el director con el builder (clase q implementa la interfaz) como
	// parametro
	public HospitalDirector(HospitalBuilder hospitalBuilder) {
		this.hospitalBuilder = hospitalBuilder;
	}

	// aplico los metodos de la interfaz (los build y el get) para construir el
	// hospital

	public void construirHospital() {
		hospitalBuilder.buildEspecialidad();
		hospitalBuilder.builPersonal();
		hospitalBuilder.buildEquipamiento();
	}

	public Hospital getHospital() {
		return hospitalBuilder.getHospital();
	}
}
