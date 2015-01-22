public class Hospital {

	private String especialidad;
	private String[] personal;
	private String[] equipamiento;

	public String[] getPersonal() {
		return personal;
	}

	public void setPersonal(String[] personal) {
		this.personal = personal;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String[] getEquipamiento() {
		return equipamiento;
	}

	public void setEquipamiento(String[] equipamiento) {
		this.equipamiento = equipamiento;
	}

	@Override
	public String toString() {
		String p = "";
		int i=0;
		while(i<personal.length){
			p=p+personal[i]+", ";
			i++;
		}
		String e = "";
		int j=0;
		while(j<equipamiento.length){
			e=e+equipamiento[j]+", ";
			j++;
		}
		return "Hospital, esp. " + especialidad + "\nPersonal: " + p
				+ "\nEquipamiento: " + e;
	}
}
