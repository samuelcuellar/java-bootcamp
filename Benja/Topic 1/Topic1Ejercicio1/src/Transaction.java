public abstract class Transaction {

	private User user;
	private String transactionType;
	private double total;

	public Transaction(String type, User user) {
		this.user = user;
		this.transactionType = type;
		this.total = user.getCart().getTotal();
		System.out.println("New transaction. Type: " + type + ", total: $"
				+ total);
	}

	public double getTotal() {
		return total;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public User getUser() {
		return user;
	}

	public abstract void askRequirement();

	public abstract void setNumber(int i);

	public abstract void setName(String s);

	@Override
	public String toString() {
		return "Transaction Type: " + transactionType + ", total: $" + total;
	}
	
	public void emptyUserCart(){
		System.out.println("cart restored");
		user.getCart().empty();
	}

	public abstract String getName();

	public abstract void setEmail(String string);

	public abstract void setPassword(String string);

	public abstract String getEmail();

	public abstract String getPassword();

}
