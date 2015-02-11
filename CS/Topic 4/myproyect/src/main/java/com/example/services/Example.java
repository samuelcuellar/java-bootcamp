package com.example.services;

import java.util.ArrayList;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.domain.*;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/TestGetName")
	public String getName() {
		return getName();
	}

	@RequestMapping("/testListOffer")
	public void ListOffer() {
		ArrayList<Product> catalog = new ArrayList<Product>();
		System.out.println("The Offers are:\n");
		for (Product p : catalog) {
			if (p.isOffer()) {
				System.out.print(p.getDescription());
				System.out.print(" Price:");
				System.out.println(p.getPrice());
			}
		}
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}

}
