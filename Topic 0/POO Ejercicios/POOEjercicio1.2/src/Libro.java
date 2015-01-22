
public class Libro {
	//atributos
	private String nombre;
	private Autor autor;
	private double precio;
	private int cantStock;
	
	//constructores
	public Libro(String nombre, Autor autor, double precio, int cantStock){
		this.nombre=nombre;
		this.autor=autor;
		this.precio=precio;
		this.cantStock=cantStock;
	}
	public Libro(String nombre, Autor autor, double precio){
		this.nombre=nombre;
		this.autor=autor;
		this.precio=precio;
	}
	
	//getter and setters
	public String getNombre() {
		return nombre;
	}
	public Autor getAutor() {
		return autor;
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
	
	//toString
	public String toString() {
		return "Nombre= "+nombre+", autor= "+autor.toString()+", precio= "+precio+", stock= "+cantStock;
	}
}
