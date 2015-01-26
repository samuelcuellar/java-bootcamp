import java.util.ArrayList;
import java.util.List;

public class Offer {

	private String name;
	private double price;
	private List<Item> items;

	public Offer(String name, double price) {
		this.name = name;
		this.price = price;
		this.items = new ArrayList<Item>();
		MailList.notification("new offer has been released: " + this.toString());
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		MailList.notification("an offer has changed his price: "
				+ this.toString());
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addItem(Item i) {
		items.add(i);
	}

	@Override
	public String toString() {
		return "Offer: " + name + " $" + price + "\t" + items;
	}
}
