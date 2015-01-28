import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemCatalog {

	List<Item> catalog;

	public ItemCatalog() {
		catalog = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		catalog.add(item);
	}

	public Iterator<Item> iterator() {
		return new MenuIterator();
	}

	class MenuIterator implements Iterator<Item> {
		int currentIndex = 0;

		@Override
		public boolean hasNext() {
			if (currentIndex >= catalog.size()) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public Item next() {
			return catalog.get(currentIndex++);
		}
	}

	public void printCatalog() {
		System.out.println("Displaying Item´s Catalog:");
		Iterator<Item> iterator = catalog.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			System.out.println(item);
		}
		System.out.println();
	}
}
