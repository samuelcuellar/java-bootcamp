package globant.benja.model;

import java.util.ArrayList;

public class ItemCatalog {

	private ArrayList<Item> items;
	private static ItemCatalog singleton = null;

	private ItemCatalog() {
		this.items = new ArrayList<Item>();
	}

	public static ItemCatalog getInstance() {
		if (singleton == null) {
			singleton = new ItemCatalog();
		} 
		return singleton;
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	@Override
	public String toString() {
		return "Store Catalog: \n" + items;
	}
	/*
	 * public ItemCatalog() { catalog = new ArrayList<Item>(); }
	 * 
	 * public void addItem(Item item) { catalog.add(item); }
	 * 
	 * public Iterator<Item> iterator() { return new MenuIterator(); }
	 */

	/*
	 * class MenuIterator implements Iterator<Item> { int currentIndex = 0;
	 * 
	 * @Override public boolean hasNext() { if (currentIndex >= catalog.size())
	 * { return false; } else { return true; } }
	 * 
	 * @Override public Item next() { return catalog.get(currentIndex++); } }
	 * 
	 * public void printCatalog() {
	 * System.out.println("Displaying Item�s Catalog:"); Iterator<Item> iterator
	 * = catalog.iterator(); while (iterator.hasNext()) { Item item =
	 * iterator.next(); System.out.println(item); } System.out.println(); }
	 */
}
