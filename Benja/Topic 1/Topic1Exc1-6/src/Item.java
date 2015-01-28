public class Item {
	private String name;
	private double price;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
		MailList.notification("new item has been added: " + this.toString());
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		MailList.notification("an item has changed his price: "
				+ this.toString());
	}

	@Override
	public String toString() {
		return name + "   $" + price;
	}
}
