
public class Casa {
	private int dormitorios;
	private String cocina;
	private int baños;
	private int salas;
	
	public int getSalas() {
		return salas;
	}
	public void setSalas(int salas) {
		this.salas = salas;
	}
	public int getBaños() {
		return baños;
	}
	public void setBaños(int baños) {
		this.baños = baños;
	}
	public String getCocina() {
		return cocina;
	}
	public void setCocina(String cocina) {
		this.cocina = cocina;
	}
	public int getDormitorios() {
		return dormitorios;
	}
	public void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}
	
	@Override
	public String toString() {
		return "Dormitorios= "+dormitorios+", Baños= "+baños+", Salas= "+salas+", Cocina= "+cocina;
	}
}
