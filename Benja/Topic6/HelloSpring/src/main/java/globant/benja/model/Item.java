package globant.benja.model;

public class Item {
	private String name;
	private double price;
	private int code;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item " + code + " '" + name + "' $" + price;
	}
}
