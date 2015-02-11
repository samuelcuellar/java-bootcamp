package com.globant.bootcamps.domain;

import java.util.ArrayList;

public class Cart {

	ArrayList<Product> products = new ArrayList<Product>();

	// public Cart(){

	// }

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public double getSubTotal() {
		double total = 0;
		for (Product p : products) {
			total = total + p.getPrice();
		}
		return total;

	}

	public void addToCart(Product p) {

		products.add(p);

	}

	public void ListCart() {
		System.out.println("The Products selected:");
		for (Product p : products) {
			System.out.println(p.getDescription());
		}
		System.out.println("Total:");
		System.out.println(getSubTotal());
	}

}
