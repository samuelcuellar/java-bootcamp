package com.globant.bootcamps.domain;

public class TestCart {

	public static void main(String[] args) {

		Product p1 = new Product(001, "TvLed 42", 5999.0,true);
		Product p2 = new Product(002, "TvLed 39", 4500.0,false);
		Product p3 = new Product(003, "Heladera", 5999.0,false);
		Product p4 = new Product(004, "Microondas", 1999.0,false);
		Product p5 = new Product(005, "Aire Acondionado", 7999.0,true);

		Catalog c = new Catalog();
		c.addCatalogo(p1);
		c.addCatalogo(p2);
		c.addCatalogo(p3);
		c.addCatalogo(p4);
		c.addCatalogo(p5);
		c.ListCatalog();
		
		System.out.println();
		c.ListOffer();
	
		
		
		System.out.println("\n");
		Users us = new Users("Juan Pedro");
		System.out.print("Usuario:");
		System.out.println(us.getName());
		us.addToCart(p5);
		us.addToCart(p3);
		PaymentFactory pf = PaymentFactory.getInstance(us);
		Payment pay = pf.setPaymentMethod("Cash");
		us.listMyCart();
		System.out.print("Payment Type: ");
		System.out.println("Cash");
		pay.counter();
		pay.getDiscount();
		
		System.out.println("\n");
		Users us1 = new Users("Joaquin");
		System.out.print("Usuario:");
		System.out.println(us1.getName());
		us.addToCart(p3);
		us.addToCart(p2);
		us.addToCart(p1);
		PaymentFactory pf1 = PaymentFactory.getInstance(us);
		Payment pay1 = pf1.setPaymentMethod("CreditCard");
		us.listMyCart();
		pay1.setCreditCardNumber("****");
		pay1.setName("Cristian Salazar");
		System.out.println("Payment Type:" + " CreditCard");
		System.out.println("Usuario: " + us.getName());
		System.out.println("Credit Card Number: " + pay1.getCreditCardNumber());
		System.out.println("Descuento 10%, Total: ");
		pay1.getDiscount();
		pay1.counter();
	}

}
