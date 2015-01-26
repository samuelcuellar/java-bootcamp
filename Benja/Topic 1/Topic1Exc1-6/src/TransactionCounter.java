import java.util.ArrayList;

public class TransactionCounter {

	static ArrayList<Transaction> transactions = new ArrayList<Transaction>();

	public static Transaction setCounter(Transaction t) {
		int c = 0;
		for (int i = 0; i < transactions.size(); i++) {
			c++; // System.out.println(c);
		}
		t.setNumber1(c - 1);
		return t;
	}

	public static void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}

}
