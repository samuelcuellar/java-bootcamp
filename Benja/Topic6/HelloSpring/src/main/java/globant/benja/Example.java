package globant.benja;

import globant.benja.model.*;
import globant.benja.service.ShoppingCartServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class Example {

	@Autowired
	ShoppingCartServices serv;
	
	@RequestMapping("/")
	String home() {
		return "Todo Ok!";
	}
	
	@RequestMapping("/createItems")
	ItemCatalog createItems() {
		//ShoppingCartServices serv = new ShoppingCartServices();	
		serv.addItem("Coca 1L", 15);
		serv.addItem("Salame Paladini", 120);
		serv.addItem("Queso tibo", 90);
		serv.addItem("Pan Frances", 20);
		
		serv.addItem("Yogurt 1L", 20);
		serv.addItem("Cereal", 80);
		serv.addItem("Fruta", 90);
		
		serv.addItem("Lucky strike", 20);
		serv.addItem("Encendedor bic", 10);
		
		return serv.getCatalog();
	}
	
	@RequestMapping("/createUsers")
	ClientList createUsers() {
		//ShoppingCartServices serv = new ShoppingCartServices();	
		serv.addUser("Benjamin Salas", 34953806);
		serv.addUser("Gerardo Salas", 31659246);
		serv.addUser("Esteban Salas", 30627549);
		return serv.getClients();
	}
	
	@RequestMapping("/addItemsToCarts")
	ClientList addItemsToCarts() {
		//ShoppingCartServices serv = new ShoppingCartServices();	
		serv.addItemToCart(1, 1, 3);
		serv.addItemToCart(1, 2, 2);
		serv.addItemToCart(1, 3, 1);
		serv.addItemToCart(1, 4, 1);
		
		serv.addItemToCart(2, 5, 1);
		serv.addItemToCart(2, 6, 1);
		serv.addItemToCart(2, 7, 1);
		
		serv.addItemToCart(3, 8, 2);
		serv.addItemToCart(3, 9, 1);
		
		return serv.getClients();
	}
	
	@RequestMapping("/transactions")
	Register transactions() {
		//ShoppingCartServices serv = new ShoppingCartServices();	
		serv.newTransaction(1,"PayPal","Benjamin@gmail.com","b123s456");
		serv.newTransaction(2,"Credit Card","Gerardo Salas",265322978);
		serv.newTransaction(3,"Cash");
		
		return serv.getRegister();
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}
}
