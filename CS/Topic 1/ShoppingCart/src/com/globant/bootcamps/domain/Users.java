package com.globant.bootcamps.domain;

public class Users {

	private String name;
	private Cart cart;
	private String email;
	private String password;

	public Users(String name) {
		this.name = name;
		this.email = "salazare86@gmail.com";
		this.password = "****";
		this.cart = new Cart();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void addToCart(Product p) {
		this.cart.addToCart(p);
	}

	public void listMyCart() {
		this.cart.ListCart();
	}
}