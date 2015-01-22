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

		personal[0]= "Cardiólogo";
		personal[1]= "Clínico";
		
		hospital.setPersonal(personal);
	}

	@Override
	public void buildEquipamiento() {
		String[] equipamiento = new String[4];

		equipamiento[0]= "Monitor Multiparamétrico EDAN";
		equipamiento[1]= "Cardiodesfibrilador bifásico CARDIOMAX";
		equipamiento[2]= "Electrocardiógrafo - RG401";
		equipamiento[3]= "Cintas para Ergometría";
		
		hospital.setEquipamiento(equipamiento);
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}