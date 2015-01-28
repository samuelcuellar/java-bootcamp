package entities;

import java.util.ArrayList;

public class Cart {

	ArrayList<Items>item= new ArrayList<Items>();;
	
	
	
	public Cart(ArrayList<Items> item) {

		this.item = item;
	}

	public ArrayList<Items> getItem() {
		return item;
	}

	public void setItem(ArrayList<Items> item) {
		this.item = item;
	}

	public double getTotal() {
		double total = 0;
		for (Items i : item) {
			total = total + i.getPrecio();
		}
		return total;
	}

	public void addToCart(Items item) {
		item.add(item);
		System.out.println(item.getDescripcion() + " add to cart..");
	}

	public void ListCart() {
		System.out.println(item + " Total= $" + getTotal());

	}

}
