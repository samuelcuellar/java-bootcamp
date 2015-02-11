package com.globant.bootcamps.domain;

public class CashPayment extends Payment {

	private Cart c;

	public CashPayment(String type, Users user) {
		super(type, user);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPayment() {

		c.getSubTotal();
		System.out.println(c.getSubTotal());
	}

	@Override
	public String setEmail() {
		return null;
	}

	@Override
	public String setPassword() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setCreditCardNumber(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setName(String sa) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCreditCardNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getDiscount() {

	}

	@Override
	public void counter() {
		int serialNumber;
		int counter = 0;
		counter++;
		serialNumber = counter;

	}

}

	

