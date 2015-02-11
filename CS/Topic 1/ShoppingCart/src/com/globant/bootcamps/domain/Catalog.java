package com.globant.bootcamps.domain;

import java.util.ArrayList;


public class Catalog {

	ArrayList<Product>catalog=new ArrayList<Product>();
	

	public Catalog() {	
		
	}

	public void addCatalogo(Product p){
		catalog.add(p);
		
		
	}
	public void ListCatalog() {

		System.out.println("The Products are:\n");
		for (Product p : catalog) {
			System.out.print(p.getDescription());
			System.out.print(" Price:");
			System.out.println(p.getPrice());
		}
	}
	public void ListOffer(){
		
		System.out.println("The Offers are:\n");
			for(Product p : catalog){
				if(p.isOffer()){
			System.out.print(p.getDescription());
			System.out.print(" Price:");
			System.out.println(p.getPrice());
			}
		}
		
	}
		
	

}
