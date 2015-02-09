package globant.benja.model;

public class CartLine {

	private Item item;
	private int cant;
	private double subTotal;

	public CartLine(Item item, int cant) {
		this.item = item;
		this.cant = cant;
		this.subTotal = calcularSubTotal();
	}

	public Item getItem() {
		return item;
	}

	public void setItems(Item item) {
		this.item = item;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public double calcularSubTotal() {
		return item.getPrice() * cant;
	}

	@Override
	public String toString() {
		return "" + item + " x" + cant + " = $" + subTotal;
	}
}
