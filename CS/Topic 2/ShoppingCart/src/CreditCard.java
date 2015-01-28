import entities.User;

public class CreditCard extends User {

	private String creditCardNumer;

	public CreditCard() {

		creditCardNumer = "000000000000";
	}

	public CreditCard(String creditCardNumer) {

		this.creditCardNumer = creditCardNumer;
	}

	public String getCreditCardNumer() {
		return creditCardNumer;
	}

	public void setCreditCardNumer(String creditCardNumer) {
		this.creditCardNumer = creditCardNumer;
	}

}
