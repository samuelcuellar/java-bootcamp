import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OfferCatalog {

	List<Offer> catalog;

	public OfferCatalog() {
		catalog = new ArrayList<Offer>();
	}

	public void addItem(Offer o) {
		catalog.add(o);
	}

	public Iterator<Offer> iterator() {
		return new MenuIterator();
	}

	class MenuIterator implements Iterator<Offer> {
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
		public Offer next() {
			return catalog.get(currentIndex++);
		}
	}

	public void printCatalog() {
		System.out.println("Displaying Offers Catalog:");
		Iterator<Offer> iterator = catalog.iterator();
		while (iterator.hasNext()) {
			Offer o = iterator.next();
			System.out.println(o);
		}
		System.out.println();
	}
}
