package globant.benja.model;

public abstract class Transaction {

	private int number;
	private double total;
	private double neto;
	private User user;
	private String type;
	private boolean state;	//false x default... para q no se puede concluir hasta no tener los req

	public Transaction() {
	}
	
	public Transaction(User user, String type) {
		// this.number = servicioContador();
		this.setNeto(user.getCart().getTotal());
		this.type = type;
		this.state = false;
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getNeto() {
		return neto;
	}

	public void setNeto(double neto) {
		this.neto = neto;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transaction " + number + ".\nType: " + type + ". Neto: $"
				+ neto + ". Total with discount: $" + total;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public abstract void agregarTitular(String titular);
	public abstract void setCardNumber(int number);

	public abstract void setEmail(String email);

	public abstract void setPassword(String password);

}
