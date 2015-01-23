public class User {
	
	private String name;
	private Cart cart;
	
	public User(String name) {
		this.name =name;
		this.cart = new Cart();
	}

	public String getName() {
		return name;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	@Override
	public String toString() {
		return "User= "+name;
	}

	public void addToCart(Item item) {
		this.cart.addToCart(item);
	}

	
	public void listMyCart() {
		System.out.println(getName()+" Cart:");
		this.cart.ListCart();
	}
	
	
}
