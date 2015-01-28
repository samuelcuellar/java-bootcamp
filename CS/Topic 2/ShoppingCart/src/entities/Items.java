package entities;

public class Items {

	private int quantity;
	private int code;
	private String descripcion;
	private double price;

	// private double total;

	public Items() {
		quantity = 0;
		code = 0000;
		descripcion = "null";
		price = 0.0;
	}

	public Items(int code, String descripcion, double precio, int quantity) {

		this.quantity = quantity;
		this.code = code;
		this.descripcion = descripcion;
		this.price = precio;
	}

	public Items(int code, String descripcion, double precio) {

		this.code = code;
		this.descripcion = descripcion;
		this.price = precio;
	}

	public Items(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return price;
	}

	public void setPrecio(double precio) {
		this.price = precio;
	}

	public String toString() {

		return "Description= " + descripcion + " Code= " + code + " Units= " + quantity + " Precio unidad= " + price + "\n";
	}

}
