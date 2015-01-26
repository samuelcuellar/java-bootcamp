import java.util.ArrayList;

public class TotalCalculatorWithDiscount {

	private static double discount;
	private static ArrayList<Item> items;

	public static Transaction getTotalWithDiscount(Transaction transaccion) {

		String type = transaccion.getTransactionType();
		items = new ArrayList<Item>();
		items = transaccion.getUser().getCart().getItems();

		switch (type) {
		case "Credit Card":
			discount = transaccion.getUser().getCart().getTotal() * 0.10;
			System.out.println("Discount: $" + discount);// control
			break;
		case "PayPal":
			// identificar item mas barato
			Item cheapestItem;
			cheapestItem = items.get(0); // el 1er item sirve de referencia
			for (Item i : items) {
				if (i.getPrice() < cheapestItem.getPrice()) {
					cheapestItem = i;
				}
			}
			System.out.println("Cheapest item: " + cheapestItem);// control
			discount = cheapestItem.getPrice();// el descuento consiste en que
												// el item mas barato es
												// gratis..
			System.out.println("Discount: $" + discount);// control
			break;
		case "Cash":
			Item mostExpensiveItem;
			mostExpensiveItem = items.get(0); // el 1er item sirve de referencia
			for (Item i : items) {
				if (i.getPrice() > mostExpensiveItem.getPrice()) {
					mostExpensiveItem = i;
				}
			}
			discount = mostExpensiveItem.getPrice() * 0.9;
			System.out.println("Most Expensive item: " + mostExpensiveItem);
			System.out.println("Discount: $" + discount);// control
			break;
		default:
			discount = 0;
			System.out.println("No se pudo identificar el medio de pago");
			break;
		}

		transaccion.setTotal(transaccion.getTotal() - discount);
		return transaccion;
	}
}
