public class BuilderTraumatologia implements HospitalBuilder{

	private Hospital hospital;
	
	public BuilderTraumatologia() {
		hospital = new Hospital();
	}
	
	@Override
	public void buildEspecialidad() {
		hospital.setEspecialidad("Traumatología");
	}

	@Override
	public void builPersonal() {
		String[] personal = new String[3];

		personal[0]= "Traumatólogo";
		personal[1]= "Radiólogo";
		personal[2]= "Clínico";
		
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
