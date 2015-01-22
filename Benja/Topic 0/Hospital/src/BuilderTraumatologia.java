public class BuilderTraumatologia implements HospitalBuilder{

	private Hospital hospital;
	
	public BuilderTraumatologia() {
		hospital = new Hospital();
	}
	
	@Override
	public void buildEspecialidad() {
		hospital.setEspecialidad("Traumatolog�a");
	}

	@Override
	public void builPersonal() {
		String[] personal = new String[3];

		personal[0]= "Traumat�logo";
		personal[1]= "Radi�logo";
		personal[2]= "Cl�nico";
		
		hospital.setPersonal(personal);
	}

	@Override
	public void buildEquipamiento() {
		String[] equipamiento = new String[3];

		equipamiento[0]= "Proyector Rayos x";
		equipamiento[1]= "Scanner";
		equipamiento[2]= "impresora Rx";
		
		hospital.setEquipamiento(equipamiento);
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}
