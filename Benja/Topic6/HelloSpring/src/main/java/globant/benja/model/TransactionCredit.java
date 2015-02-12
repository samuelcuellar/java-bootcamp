package globant.benja.model;

public class TransactionCredit extends Transaction{

	private int cardNumber;
	private String titular;
	
	public TransactionCredit(User user, String type) {
		super(user, type);
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + ". Card Number: " + cardNumber + ". Titular: " + titular;
	}

	@Override
	public void agregarTitular(String titular) {
		setTitular(titular);
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}
}
