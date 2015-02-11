package com.example.domain;

public class CreditCardPayment extends Payment {

	private Users user;
	private Cart c;

	public CreditCardPayment(String type, Users user) {
		super(type, user);
		// TODO Auto-generated constructor stub
	}

	public void getPayment() {
		c.getSubTotal();
		System.out.println(c.getSubTotal());
	}

	public void getDiscount() {
		double subTotal;
		double total1;
		subTotal = ((c.getSubTotal() * 10) / 100);
		total1 = c.getSubTotal() - subTotal;
		System.out.println(total1);
	}

	@Override
	public String setEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCreditCardNumber() {
		return "****";
		// TODO Auto-generated method stub

	}

	@Override
	public void setCreditCardNumber(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void counter() {
		int serialNumber;
		int counter = 0;
		counter++;
		serialNumber = counter;// TODO Auto-generated method stub

	}

}
