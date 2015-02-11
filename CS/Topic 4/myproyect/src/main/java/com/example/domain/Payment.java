package com.example.domain;



public abstract class Payment {

	
	private String string;
	private Users user;

	public Payment(String type, Users user) {
		this.string = type;
		this.user = user;
		
		
	}
	
	public abstract void setCreditCardNumber(String s);

	public abstract void setName(String sa);
	
	public abstract void getPayment();
	
	public abstract void getDiscount();

	public abstract String getCreditCardNumber();

	public abstract String setEmail();

	public abstract String setPassword();

	public abstract String getName();

	public abstract void counter();
		
	
	}


