package globant.benja.model;

import java.util.ArrayList;

public class Register {
	
	private ArrayList<Transaction> transactions;
	private static Register singleton = null;

	private Register() {
		this.transactions = new ArrayList<Transaction>();
	}

	public static Register getInstance() {
		if (singleton == null) {
			singleton = new Register();
		} 
		return singleton;
	}
	
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
	@Override
	public String toString() {
		return "Store Transactions: \n" + transactions;
	}
}
