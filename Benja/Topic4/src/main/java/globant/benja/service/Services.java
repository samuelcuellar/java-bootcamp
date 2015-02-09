package globant.benja.service;

import globant.benja.model.*;

public class Services {

	public void addItem(String name, double price) {

		System.out.println("new item.");
		ItemCatalog catalog = ItemCatalog.getInstance();
		Item item = new Item(name, price);
		if (validarItem(catalog, item)) {
			// catalog.getItems().add(item);
			// darle un numero al item
			int j = 0;
			for (Item i : catalog.getItems()) {
				j = i.getCode();
			}
			System.out.println("imprimir catalogo (control)");
			item.setCode(j + 1);
			catalog.getItems().add(item);
			System.out.println(catalog);
		} else {
			System.out.println("No se pudo dar de alta el " + item);

		}
	}

	private boolean validarItem(ItemCatalog catalog, Item item) {
		boolean flag = true;
		for (Item i : catalog.getItems()) {
			if (i.getName() == item.getName()) {
				flag = false;
				System.out.println("Nombre duplicado");
			}
		}
		return flag;
	}

	public void deleteItem(int delete) {
		System.out.println("\ndelete item.");
		ItemCatalog catalog = ItemCatalog.getInstance();
		Item rem = null;
		for (Item i : catalog.getItems()) {
			if (i.getCode() == delete) {
				rem = i;
			}
		}
		catalog.getItems().remove(rem);
		System.out.println(catalog);
	}

	public void addUser(String name, int dni) {
		System.out.println("new user.");

		ClientList clients = ClientList.getInstance();
		User user = new User(name, dni);
		if (validarUsuario(clients, user)) {

			// darle un numero al cliente
			int j = 0;
			for (User u : clients.getUsers()) {
				j = u.getId();
			}

			user.setId(j + 1);
			clients.getUsers().add(user);
			System.out.println(clients);
		} else {
			System.out.println("No se pudo dar de alta a " + user);
		}
	}

	private boolean validarUsuario(ClientList clients, User user) {
		boolean flag = true;
		for (User i : clients.getUsers()) {
			if (i.getName() == user.getName()) {
				flag = false;
				System.out.println("Nombre duplicado");
			}
			if (i.getDni() == user.getDni()) {
				flag = false;
				System.out.println("Dni duplicado");
			}
		}
		return flag;
	}

	public void delete(int delete) {
		System.out.println("\ndelete user.");
		ClientList clients = ClientList.getInstance();
		User removeUser = null;
		for (User u : clients.getUsers()) {
			if (u.getId() == delete) {
				removeUser = u;
			}
		}
		clients.getUsers().remove(removeUser);
		System.out.println(clients);
	}

	public void addItemToCart(int id, int code, int cant) {
		System.out.println("\nadd to user n° " + id + " cart: " + code + " x"
				+ cant);
		ClientList clients = ClientList.getInstance();
		ItemCatalog catalog = ItemCatalog.getInstance();
		Item itemToAdd = null;

		for (Item item : catalog.getItems()) {

			if (item.getCode() == code) {
				itemToAdd = item;
			}
		}
		if (itemToAdd == null) {
			System.out.println("Codigo incorrecto");
		} else {
			for (User user : clients.getUsers()) {

				if (user.getId() == id) {

					CartLine line = new CartLine(itemToAdd, cant);
					user.getCart().getLines().add(line);
					user.getCart().calcularTotal();
					System.out.println(user.getCart());
				}
			}
		}
	}

	public void newTransaction(int id, String type, String titular, int cardNumber) {

		System.out.println("New Credit Card Transaction");
		
		User user = findUser(id);

		Transaction transaction = TransactionFactory.createTransaction(user,
				type);
		transaction.setNeto(user.getCart().getTotal());
		
		//requirements
		transaction.agregarTitular(titular);
		transaction.setCardNumber(cardNumber);

		transaction = calculateDiscount(transaction);
		transaction.setState(true);
		
		transaction = calculateDiscount(transaction);
		
		finishTransaction(transaction);
	}

	private User findUser(int id) {
		ClientList clients = ClientList.getInstance();
		User user = null;

		for (User u : clients.getUsers()) {
			if (u.getId() == id) {
				user = u;
			}
		}
		return user;
	}

	private Transaction calculateDiscount(Transaction transaction) {

		String type = transaction.getType();

		double discount;
		switch (type) {
		case "Credit Card":
			discount = transaction.getNeto() * 0.10;
			break;

		case "PayPal":
			// identificar item mas barato
			Item cheapestItem;
			cheapestItem = transaction.getUser().getCart().getLines().get(0)
					.getItem(); // el 1er item sirve de referencia

			for (CartLine line : transaction.getUser().getCart().getLines()) {
				if (line.getItem().getPrice() < cheapestItem.getPrice()) {
					cheapestItem = line.getItem();
				}
			}
			// calcular el descuento en base al item mas barato
			discount = cheapestItem.getPrice();
			break;

		case "Cash":
			Item mostExpItem;
			mostExpItem = transaction.getUser().getCart().getLines().get(0)
					.getItem(); // el 1er item sirve de referencia

			for (CartLine line : transaction.getUser().getCart().getLines()) {
				if (line.getItem().getPrice() > mostExpItem.getPrice()) {
					mostExpItem = line.getItem();
				}
			}
			// calcular el descuento en base al item mas barato
			discount = mostExpItem.getPrice() * 0.9;
			break;
		default:
			discount = 0;
			System.out.println("No se pudo identificar el medio de pago");
			break;
		}

		transaction.setTotal(transaction.getNeto() - discount);
		return transaction;
	}

	public void finishTransaction(Transaction transaction) {

		Register registro = Register.getInstance();
		//Transaction transaction = new Transaction();
		// darle un numero al cliente
		int j = 0;
		for (Transaction t : registro.getTransactions()) {
			j = t.getNumber();
		}

		transaction.setNumber(j + 1);
		if(transaction.isState()){
			registro.getTransactions().add(transaction);
		}
		System.out.println(registro);
	}

	public void newTransaction(int id, String type, String email,
			String password) {
		
		System.out.println("New PayPal Transaction");
		User user = findUser(id);

		Transaction transaction = TransactionFactory.createTransaction(user,
				type);
		transaction.setNeto(user.getCart().getTotal());
		
		System.out.println(type + " Transaction created.");
		//requirements
		transaction.setEmail(email);
		transaction.setPassword(password);

		transaction = calculateDiscount(transaction);
		transaction.setState(true);
		
		transaction = calculateDiscount(transaction);
		
		finishTransaction(transaction);
	}

}
