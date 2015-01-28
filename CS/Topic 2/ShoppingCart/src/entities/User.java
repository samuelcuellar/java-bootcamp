package entities;

public class User {

	private Cart cart;
	private String user;
	private String password;

	public User() {

		user = "cristian07";
		password = "123456";
	}
	public User(String user){
		this.user=user;
		
	}
	

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void addToCart(Items item) {
		this.cart.addToCart(item);

	public void listMyCart() {
		System.out.println(getUser() + " Cart:");
		this.cart.ListCart();
	}

}