package lastProject.web;

import java.util.ArrayList;

import lastProject.model.Category;
import lastProject.model.Line;
import lastProject.model.Product;
import lastProject.model.User;
import lastProject.service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LastProjectController {

	@Autowired
	Services service;

	@RequestMapping("/")
	public String home() {
		return "Last Project starts now!";
	}

	// method to create categories
	@RequestMapping("/createCategory")
	public String createCat(String name) {
		return service.createCategory(name);
	}

	// method to list all categories
	@RequestMapping("/getCategory")
	public Iterable<Category> getAllCategory() {
		return service.allCategory();
	}

	// method to create users
	@RequestMapping("/createUser")
	public String createU(String name, String lastName, String email, String pass) {
		return service.createUser(name, lastName, email, pass);
	}

	// method to update users
	@RequestMapping("/updateUser")
	public String updateU(long idUser, String name, String lastName, String email, String pass) {
		return service.updateUser(idUser, name, lastName, email, pass);
	}

	// method to delete users
	@RequestMapping("/deleteUser")
	public String deleteU(long idUser) {
		return service.deleteUser(idUser);
	}

	// method to list all users
	@RequestMapping("/getUser")
	public Iterable<User> getAllUser() {
		return service.allUser();
	}

	// method to create product
	@RequestMapping("/createProduct")
	public String createProd(String name, int price, long idCategory) {
		return service.createProduct(name, price, idCategory);
	}

	// method to list all products
	@RequestMapping("/getProduct")
	public Iterable<Product> getAllProduct() {
		return service.allProduct();
	}

	// method to create Shop
	@RequestMapping("/createShop")
	public String createS(long idUser) {
		return service.createShop(idUser);
	}

	// method to buy products
	@RequestMapping("/buyProduct")
	public String buyProd(long idProduct, int cantidad, long idShop, long idUser) {
		return service.buyProduct(idProduct, cantidad, idShop, idUser);
	}

	// method to delete buy
	@RequestMapping("/deleteBuy")
	public String deleteL(long idLine) {
		return service.deleteLine(idLine);
	}

	// method to login
	@RequestMapping("/login")
	public String loginU(String email, String pass) {
		return service.loginUser(email, pass);
	}

	// method to list products by category
	@RequestMapping("/byCategory")
	public ArrayList<Product> filterByCateg(String name) {
		return service.filterByCategory(name);
	}

	// method to show the shoplist
	@RequestMapping("/byShop")
	public ArrayList<Line> filterByShop(long idShop) {
		return service.filterByLine(idShop);
	}

	// method to set type of payment
	@RequestMapping("/payBy")
	public String payB(long idShop, String pay) {
		return service.payBy(idShop, pay);
	}
}
