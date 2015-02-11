package com.example.domain;



public class PaymentFactory {

	//
	private Users user;
	private static PaymentFactory singleton = null;

	public PaymentFactory(Users user2) {
		// TODO Auto-generated constructor stub
	}

	public Cart getUser() {
		return singleton.getUser();
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public static PaymentFactory getSingleton() {
		return singleton;
	}

	public static void setSingleton(PaymentFactory singleton) {
		PaymentFactory.singleton = singleton;
	}

	public static PaymentFactory getInstance(Users user) {
		if (singleton == null) {
			singleton = new PaymentFactory(user);
		} else {
			singleton.setUser(user);
		}
		return singleton;
	}
	

	/*public Payment getPayment(String type) {
		if ("Cash".equals(type)) {
			return new CashPayment();
		} else if ("CreditCard".equals(type)) {
			return new CreditCardPayment();
		} else {
			return new PayPalPayment();
		}

	}*/
	public Payment setPaymentMethod(String type) {
		Payment p;
		String a = type;
		switch (a) {
		case "Credit Card":
			p = new CreditCardPayment(type,user);
			break;
		case "PayPal":
			p = new PayPalPayment(type,user);
			break;
		case "Cash":
			p = new CashPayment(type,user);
			break;	
		default:
			p= new CashPayment(type,user);
			break;
		}
		return p;
	}
}