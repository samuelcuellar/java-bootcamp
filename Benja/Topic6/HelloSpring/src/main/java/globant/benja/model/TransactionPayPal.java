package globant.benja.model;

public class TransactionPayPal extends Transaction{

	private String email;
	private String password;
	
	public TransactionPayPal(User user, String type) {
		super(user, type);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString() + ". Email: " + email + ". Password: " + password;
	}

	@Override
	public void agregarTitular(String titular) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCardNumber(int number) {
		// TODO Auto-generated method stub
		
	}
}
