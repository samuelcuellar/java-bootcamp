public class TransPayPal extends Transaction {

	private String email;
	private String password;

	public TransPayPal(String type, User user) {
		super(type, user);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void askRequirement() {
		System.out.println("A Paypal email acount is required");
	}

	@Override
	public void setNumber(int i) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setName(String s) {
		// TODO Auto-generated method stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
