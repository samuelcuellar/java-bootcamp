
public class Autor {
	private String nombre;
	private String email;
	private char sexo;
	
	public Autor(String nombre, String email, char sexo){
		this.nombre=nombre;
		this.email=email;
		this.sexo=sexo;
	}
	public String getNombre() {
		return nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Nombre= "+nombre+", email= "+email+", sexo="+sexo;
	}
}
