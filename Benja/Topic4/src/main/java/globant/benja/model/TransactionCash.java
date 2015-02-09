package globant.benja.model;

public class TransactionCash extends Transaction{

	public TransactionCash(User user, String type) {
		super(user, type);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Non Extra information is required.";
	}

	@Override
	public void agregarTitular(String titular) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCardNumber(int number) {
		// TODO Auto-generated method stub
		
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
