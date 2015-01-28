public class TransactionFactory {

	private User user;
	private static TransactionFactory singleton = null;

	private TransactionFactory(User user) {
		this.user = user;
	}

	public static TransactionFactory getInstance(User user) {
		if (singleton == null) {
			singleton = new TransactionFactory(user);
		} else {
			singleton.setUser(user);
		}
		return singleton;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Transaction setPaymentMethod(String type) {
		Transaction t;
		String a = type;
		switch (a) {
		case "Credit Card":
			t = new TransCreditCard(user, type);
			break;
		case "PayPal":
			t = new TransPayPal(type, user);
			break;
		case "Cash":
			t = new TransactionCash(type, user);
			break;
		default:
			t = new TransactionCash(type, user);
			break;
		}
		return t;
	}

}
