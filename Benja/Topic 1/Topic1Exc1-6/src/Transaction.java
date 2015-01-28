public abstract class Transaction {

	private User user;
	private String transactionType;
	private double total;
	private TotalCalculatorWithDiscount calculator;
	private int number;

	public Transaction(String type, User user) {
		this.user = user;
		this.transactionType = type;
		this.total = user.getCart().getTotal();
		TransactionCounter.addTransaction(this);
		TransactionCounter.setCounter(this);
		System.out.println("New transaction (" + number + "). Type: " + type
				+ ", total: $" + total);
		MailList.notification("A new transaction has been made: "
				+ this.toString());
	}

	public void setNumber1(int number) {
		this.number = number;
	}

	public TotalCalculatorWithDiscount getCalculator() {
		return calculator;
	}

	public void setTotal(double total) {
		this.total = total;
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

	public void emptyUserCart() {
		System.out.println("cart restored");
		user.getCart().empty();
	}

	public abstract String getName();

	public abstract void setEmail(String string);

	public abstract void setPassword(String string);

	public abstract String getEmail();

	public abstract String getPassword();

	public abstract void printPaymentInformation();

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Transaction Type: " + transactionType + "\t number: " + number
				+ "\t total: $" + total;
	}
}
