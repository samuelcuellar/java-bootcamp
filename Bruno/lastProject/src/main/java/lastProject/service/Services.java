package lastProject.service;

import java.util.ArrayList;

import lastProject.dao.CategoryDao;
import lastProject.dao.LineDao;
import lastProject.dao.ProductDao;
import lastProject.dao.ShopDao;
import lastProject.dao.UserDao;
import lastProject.model.Category;
import lastProject.model.Line;
import lastProject.model.Product;
import lastProject.model.Shop;
import lastProject.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

	@Autowired
	LineDao lineDao;

	@Autowired
	ShopDao shopDao;

	@Autowired
	ProductDao productDao;

	@Autowired
	UserDao userDao;

	@Autowired
	CategoryDao categoryDao;

	// method to create categories
	public String createCategory(String name) {
		try {
			Category category = new Category(name);

			categoryDao.save(category);
		} catch (Exception ex) {
			return "Error creating Category: " + ex.toString();
		}
		return "Category succesfully created!";
	}

	// method to list all categories
	public Iterable<Category> allCategory() {
		return categoryDao.findAll();
	}

	// method to create users
	public String createUser(String name, String lastName, String email, String pass) {
		try {
			User user = new User(name, lastName, email, pass);

			userDao.save(user);
		} catch (Exception ex) {
			return "Error creating User: " + ex.toString();
		}
		return "User succesfully created";
	}

	// method to update users
	public String updateUser(long idUser, String name, String lastName, String email, String pass) {
		try {
			User user = userDao.findOne(idUser);
			user.setName(name);
			user.setLastName(lastName);
			user.setEmail(email);
			user.setPass(pass);

			userDao.save(user);
		} catch (Exception ex) {
			return "Error updating User: " + ex.toString();
		}
		return "User sucessfully updated";
	}

	// method to delete users
	public String deleteUser(long idUser) {
		try {
			User user = userDao.findOne(idUser);

			userDao.delete(user);
		} catch (Exception ex) {
			return "Error deleting User: " + ex.toString();
		}
		return "User sucessfully deleted";
	}

	// method to list all users
	public Iterable<User> allUser() {
		return userDao.findAll();
	}

	// method to create products
	public String createProduct(String name, int price, long idCategory) {
		try {
			Category category = categoryDao.findOne(idCategory);
			Product product = new Product(name, price);
			product.setCategory(category);

			productDao.save(product);
		} catch (Exception ex) {
			return "Error creating Product: " + ex.toString();
		}
		return "Product sucessfully created";
	}

	// method to list all products
	public Iterable<Product> allProduct() {
		return productDao.findAll();
	}

	// method to create shops
	public String createShop(long idUser) {
		try {
			User user = userDao.findOne(idUser);
			Shop shop = new Shop("no payed", user);

			shopDao.save(shop);
		} catch (Exception ex) {
			return "Error creating Shop: " + ex.toString();
		}
		return "Shop created OK";
	}

	// method to buy products
	public String buyProduct(long idProduct, int cantidad, long idShop, long idUser) {
		try {
			User user = userDao.findOne(idUser);
			Product product = productDao.findOne(idProduct);
			Shop shop = shopDao.findOne(idShop);
			long idCategory = product.getIdCategory();
			Category category = categoryDao.findOne(idCategory);

			Line line = new Line(user, shop, product, category);
			line.setCantidad(cantidad);
			lineDao.save(line);

		} catch (Exception ex) {
			return "Error adding Product " + ex.toString();
		}
		return "Product sucessfully added";
	}

	// method to delete buy
	public String deleteLine(long idLine) {
		try {
			Line line = lineDao.findOne(idLine);

			lineDao.delete(line);
		} catch (Exception ex) {
			return "Error deleting Line: " + ex.toString();
		}
		return "Line succesfully deleted";
	}

	// method to login
	public String loginUser(String email, String pass) {
		boolean exist = false;
		try {
			User user = userDao.findByEmail(email);
			if (user.getPass().equals(pass)) {
				exist = true;
			}
		} catch (Exception ex) {
			return "Error with the user or password: " + ex.toString();
		}
		if (exist == true)
			return "Login OK";
		else
			return "No user found";
	}

	// method to list products by category
	public ArrayList<Product> filterByCategory(String name) {
		ArrayList<Product> products = (ArrayList<Product>) productDao.findAll();
		ArrayList<Product> aux = new ArrayList<Product>();
		for (int i = 0; i < products.size(); i++) {
			Product p = (Product) products.get(i);
			if (p.getNameCategory().equals(name)) {
				aux.add(p);
			}
		}
		return aux;
	}

	// method to show the shoplist
	public ArrayList<Line> filterByLine(long idShop) {
		ArrayList<Line> lines = (ArrayList<Line>) lineDao.findAll();
		ArrayList<Line> aux = new ArrayList<Line>();
		for (int i = 0; i < lines.size(); i++) {
			Line l = (Line) lines.get(i);
			if (l.getIdShop() == idShop) {
				aux.add(l);
			}
		}
		return aux;
	}

	// method to set type of payment
	public String payBy(long idShop, String pay) {
		try {
			Shop shop = shopDao.findOne(idShop);
			shop.setPay(pay);
			shopDao.save(shop);
		} catch (Exception ex) {
			return "Error: " + ex.toString();
		}
		return "Payment with cash done!";
	}

}
