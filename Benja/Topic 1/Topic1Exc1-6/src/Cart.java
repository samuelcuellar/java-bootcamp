import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Offer> offers = new ArrayList<Offer>();

	public ArrayList<Item> getItems() {
		return items;
	}

	public ArrayList<Offer> getOffers() {
		return offers;
	}

	public double getTotal() {
		double totalItems = 0, totalOffers = 0;
		for (Item i : items) {
			totalItems = totalItems + i.getPrice();
		}
		for (Offer o : offers) {
			totalOffers = totalOffers + o.getPrice();
		}
		return totalItems + totalOffers;
	}

	public void addToCart(Item item) {
		items.add(item);
		System.out.println(item.getName() + " add to cart..");
	}

	public void ListCart() {
		System.out.println(items);
		System.out.println(offers + " Total= $" + getTotal());
	}

	public void empty() {
		items.clear();
		offers.clear();
		System.out.println("empty this cart");
	}

	public void addToCart(Offer offer) {
		offers.add(offer);
	}

}
