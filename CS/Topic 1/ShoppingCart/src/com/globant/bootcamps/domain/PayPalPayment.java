package com.globant.bootcamps.domain;

public class PayPalPayment extends Payment {

	private Users user;
	private Cart c;

	public PayPalPayment(String type, Users user) {
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
		// TODO Auto-generated method stub
		return user.getEmail();
	}

	@Override
	public String setPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public void setName(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCreditCardNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCreditCardNumber(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDiscount() {
		// TODO Auto-generated method stub
		// return null;
	}

	@Override
	public void counter() {
		int serialNumber;
		int counter = 0;
		counter++;
		serialNumber = counter;

	}

}
