public class BuilderCardiologia implements HospitalBuilder{

	private Hospital hospital;
	
	public BuilderCardiologia() {
		hospital = new Hospital();
	}
	
	@Override
	public void buildEspecialidad() {
		hospital.setEspecialidad("Cardiologia");
	}

	@Override
	public void builPersonal() {
		String[] personal = new String[2];

		personal[0]= "Cardi�logo";
		personal[1]= "Cl�nico";
		
		hospital.setPersonal(personal);
	}

	@Override
	public void buildEquipamiento() {
		String[] equipamiento = new String[4];

		equipamiento[0]= "Monitor Multiparam�trico EDAN";
		equipamiento[1]= "Cardiodesfibrilador bif�sico CARDIOMAX";
		equipamiento[2]= "Electrocardi�grafo - RG401";
		equipamiento[3]= "Cintas para Ergometr�a";
		
		hospital.setEquipamiento(equipamiento);
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}