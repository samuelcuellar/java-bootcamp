package globant.benja.model;
public class TransactionFactory {

	public final static String CREDIT_CARD = "Credit Card";
	public final static String CASH = "Cash";
	public final static String PayPal = "PayPal";

	public static Transaction createTransaction(User user, String type) {
		Transaction t;
		String a = type;
		switch (a) {
		case CREDIT_CARD:
			t = new TransactionCredit(user, type);
			break;
		case PayPal:
			t = new TransactionPayPal(user, type);
			break;
		case CASH:
			t = new TransactionCash(user, type);
			break;
		default:
			t = new TransactionCash(user, type);
			break;
		}
		return t;
	}
}
