public class TransactionCash extends Transaction {

	public TransactionCash(String type, User user) {
		super(type, user);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void askRequirement() {
		System.out.println("No information is required");
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
		return null;
	}

	public void setEmail(String email) {
	}

	public String getPassword() {
		return null;
	}

	public void setPassword(String password) {
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printPaymentInformation() {
	}

}
