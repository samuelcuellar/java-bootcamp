public class Prueba {

	public static void main(String[] args) {
		
		Item i1 = new Item("remera", 350.00);
		Item i2 = new Item("zapatilla", 900.00);
		Item i3 = new Item("short", 250.00);
		Item i4 = new Item("buzo", 420.00);
		Item i5 = new Item("calza", 150.00);

		User usuario = new User("Benjamin Salas");//junto con el user se crea el carrito
		
		System.out.println("Current "+usuario);
		
		usuario.addToCart(i4);		//el println se hace dentro del metodo
		usuario.addToCart(i2);
		usuario.addToCart(i3);		
		usuario.listMyCart();
		usuario.getCart().empty();
		usuario.listMyCart();
		usuario.addToCart(i3);	
//		benja.removeFromCart(i2);	//el println se hace dentro del metodo
		usuario.listMyCart();			//el println se hace dentro del metodo
		
		TransactionFactory tf = TransactionFactory.getInstance(usuario);	//patron factoria
		System.out.println();
		Transaction t1 = tf.setPaymentMethod("Credit Card");
		t1.askRequirement();
		t1.setNumber(654);
		System.out.println("numero de tarjeta: *************");
		t1.setName("Benjamin Salas");
		System.out.println("titular de la tarjeta: "+t1.getName());
		System.out.println("Transaccion");
		System.out.println(t1);
		t1.emptyUserCart();
		
		usuario.listMyCart();
		
		usuario = new User("Fiorella");
		System.out.println("\nCurrent "+usuario);
		
		usuario.addToCart(i1);
		usuario.addToCart(i2);
		usuario.addToCart(i5);
		usuario.listMyCart();
		
		TransactionFactory tf2 = TransactionFactory.getInstance(usuario);
		System.out.println();
		Transaction t2 = tf2.setPaymentMethod("PayPal");
		t2.askRequirement();
		t2.setEmail("fiorella@hotmail.com");
		System.out.println("email de la cuenta PayPal: "+t2.getEmail());
		t2.setPassword("123465789");
		System.out.println("PayPal password acount: "+t2.getPassword());
		System.out.println("Transaccion");
		System.out.println(t2);
		t2.emptyUserCart();
		
		usuario.listMyCart();
		
		usuario = new User("Juan Carlos");
		System.out.println("Current "+usuario);
		
		usuario.addToCart(i1);
		usuario.addToCart(i2);
		usuario.listMyCart();
		TransactionFactory tf3 = TransactionFactory.getInstance(usuario);
		System.out.println();
		t1 = tf3.setPaymentMethod("Cash");
		t1.askRequirement();
		System.out.println("Transaccion");
		System.out.println(t1);
		t1.emptyUserCart();
		
		usuario.listMyCart();
		
	}
}
