package com.example.domain;

public class Product {

	private int code;
	private double price;
	private String description;
	private boolean offer;

	public Product(int code, String description, double price,boolean offer) {
		this.code = code;
		this.price = price;
		this.description = description;
		this.offer = offer;

	}
	
	public boolean isOffer() {
		return offer;
	}


	public void setOffer(boolean offer) {
		this.offer = offer;
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString(){
		return "Producto: " + getDescription();
	}

}
