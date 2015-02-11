package globant.benja.model;

public class Attendee {
	private int id;
	private String name;
	private int dni;
	
	public Attendee(String name, int dni) {
		this.name = name;
		this.dni = dni;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "(" + id + ") " + name + ". dni: " + dni + "\n";
	}
}
