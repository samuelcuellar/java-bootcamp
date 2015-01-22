public class Libro {
	// atributos
	private String nombre;
	private double precio;
	private int cantStock;
	private Autor[] autores;

	// constructor para n autores
	public Libro(String nombre, Autor[] autores, double precio) {
		this.nombre = nombre;
		this.autores = autores;
		this.precio = precio;
	}

	public Libro(String nombre, Autor[] autores, double precio, int cantStock) {
		this.nombre = nombre;
		this.autores = autores;
		this.precio = precio;
		this.cantStock = cantStock;
	}


	// getter and setters
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantStock() {
		return cantStock;
	}

	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}

	// toString
	public String toString() {
		return "Nombre= " + nombre + ", autor/es= " + printAutores()
				+ "precio= " + precio + ", stock= " + cantStock;
	}

	private String printAutores() {
		String a = "";
		int i=0;
		while(i<autores.length){
			a=a+autores[i].getNombre()+", ";
			i++;
		}
		return a;
	}
}
