
public class Casa {
	private int dormitorios;
	private String cocina;
	private int ba�os;
	private int salas;
	
	public int getSalas() {
		return salas;
	}
	public void setSalas(int salas) {
		this.salas = salas;
	}
	public int getBa�os() {
		return ba�os;
	}
	public void setBa�os(int ba�os) {
		this.ba�os = ba�os;
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
		return "Dormitorios= "+dormitorios+", Ba�os= "+ba�os+", Salas= "+salas+", Cocina= "+cocina;
	}
}
