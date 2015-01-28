public class TransCreditCard extends Transaction {

	private String name;
	private int number;

	public TransCreditCard(User user, String transactionType) {
		super(transactionType, user);
	}

	@Override
	public void askRequirement() {
		System.out.println("A name and a credit number is required.");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void setEmail(String string) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPassword(String string) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printPaymentInformation() {
		System.out.println("numero de tarjeta: " + number + ", titular: "
				+ name);
	}

}
