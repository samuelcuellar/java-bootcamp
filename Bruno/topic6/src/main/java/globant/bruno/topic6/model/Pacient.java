package globant.bruno.topic6.model;

public class Pacient {

	String name;
	String last_name;
	
	public Pacient(String name, String last_name){
		this.name=name;
		this.last_name=last_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
}
