import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> items = new ArrayList<Item>();

	public ArrayList<Item> getItems() {
		return items;
	}

	public double getTotal() {
		double total = 0;
		for (Item i : items) {
			total = total + i.getPrice();
		}
		return total;
	}

	public void addToCart(Item item) {
		items.add(item);
		System.out.println(item.getName() + " add to cart..");
	}

	public void ListCart() {
		System.out.println(items + " Total= $" + getTotal());

	}

	public void empty() {
		items.clear();
	}

}
