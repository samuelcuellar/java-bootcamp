package globant.benja.model;

public class User {

	private String name;
	private int dni;
	private int id;
	private Cart cart;

	public User(String name, int dni) {
		this.name = name;
		this.dni = dni;
		this.cart = new Cart();
	}

	public String getName() {
		return name;
	}

	public Cart getCart() {
		return cart;
	}

	public int getDni() {
		return dni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User " + id + ": " + name + ". dni: " + dni;
	}
}
