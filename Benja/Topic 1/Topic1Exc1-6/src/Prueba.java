public class Prueba {

	public static void main(String[] args) {

		Item i1 = new Item("remera", 350.00);
		Item i2 = new Item("zapatilla", 900.00);
		Item i3 = new Item("short", 250.00);
		Item i4 = new Item("buzo", 420.00);
		Item i5 = new Item("calza", 150.00);

		Offer offer1 = new Offer("full equip 50% off", 999.99);

		offer1.addItem(i1);
		offer1.addItem(i2);
		offer1.addItem(i3);
		offer1.addItem(i4);
		offer1.addItem(i5);

		OfferCatalog offercatalog = new OfferCatalog();
		offercatalog.addItem(offer1);

		offercatalog.printCatalog();

		ItemCatalog catalog = new ItemCatalog();
		catalog.addItem(i1);
		catalog.addItem(i2);
		catalog.addItem(i3);
		catalog.addItem(i4);
		catalog.addItem(i5);

		catalog.printCatalog();

		User usuario = new User("Benjamin Salas");// junto con el user se crea
													// el carrito

		System.out.println("Current " + usuario);

		usuario.addToCart(i4); // el println se hace dentro del metodo
		usuario.addToCart(i2);
		usuario.addToCart(i3);
		usuario.listMyCart(); // el println se hace dentro del metodo

		TransactionFactory tf = TransactionFactory.getInstance(usuario); // patron
																			// factoria
		System.out.println();
		Transaction t1 = tf.setPaymentMethod("Credit Card");
		t1.askRequirement();
		t1.setNumber(654);
		t1.setName("Benjamin Salas");
		t1.printPaymentInformation();
		t1.emptyUserCart();
		TotalCalculatorWithDiscount.getTotalWithDiscount(t1);
		System.out.println("Transaccion");
		System.out.println(t1);

		usuario.listMyCart();

		usuario = new User("Fiorella");
		System.out.println("\nCurrent " + usuario);

		usuario.addToCart(i1);
		usuario.addToCart(i2);
		usuario.addToCart(i5);
		usuario.listMyCart();

		TransactionFactory tf2 = TransactionFactory.getInstance(usuario);
		System.out.println();
		Transaction t2 = tf2.setPaymentMethod("PayPal");
		t2.askRequirement();
		t2.setEmail("fiorella@hotmail.com");
		t2.setPassword("123465789");
		t2.printPaymentInformation();
		TotalCalculatorWithDiscount.getTotalWithDiscount(t1);
		System.out.println("Transaccion");
		System.out.println(t2);
		t2.emptyUserCart();

		usuario.listMyCart();

		usuario = new User("Juan Carlos");
		System.out.println("Current " + usuario);

		usuario.addToCart(i1);
		usuario.addToCart(i2);
		usuario.listMyCart();
		TransactionFactory tf3 = TransactionFactory.getInstance(usuario);
		System.out.println();
		Transaction t3 = tf3.setPaymentMethod("Cash");
		t3.askRequirement();
		t3.printPaymentInformation();
		TotalCalculatorWithDiscount.getTotalWithDiscount(t3);
		System.out.println("Transaccion");
		System.out.println(t3);
		t1.emptyUserCart();

		usuario.listMyCart();

		usuario = new User("Mikel J.");
		System.out.println("\nCurrent " + usuario);

		usuario.addToCart(offer1);
		usuario.listMyCart();

		TransactionFactory tf4 = TransactionFactory.getInstance(usuario);
		System.out.println();
		Transaction t4 = tf4.setPaymentMethod("Credit Card");
		t4.askRequirement();
		t4.setName("Mikel Jackson jr.");
		t4.setNumber(123465789);
		t4.printPaymentInformation();
		TotalCalculatorWithDiscount.getTotalWithDiscount(t4);
		System.out.println("Transaccion");
		System.out.println(t4);
		t4.emptyUserCart();

		usuario.listMyCart();

		System.out.println("\nTransacciones: ");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}
}
