package bootcamp.benja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamp.benja.controller.CartController;
import bootcamp.benja.controller.SaleController;
import bootcamp.benja.model.Cart;
import bootcamp.benja.model.User;
import bootcamp.benja.persistence.CartDao;
import bootcamp.benja.persistence.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao _userDao;

	@Autowired
	private CartDao _cartDao;

	public long registrateUser(String fullName, String email, String userName,
			String password, String repitePassword) {

		if (repitePassword.equals(password)) {
			try {

				User user = new User(fullName, email, userName, password);
				_userDao.save(user);

				System.out.println("User successfully added to DB!");
				return user.getId();
			} catch (Exception ex) {
				System.out.println("User can not be added to DB...");
				return 0;
			}
		} else {
			return 0;
		}
	}

	public String showUser(long id) {
		User user = _userDao.findById(id);
		return user.getFullName() + " email: " + user.getEmail()
				+ " \nUserName: " + user.getUserName();
	}

	public String logInUser(String userName, String password) {

		User user = _userDao.findByUserName(userName);
		/*
		 * if (user == null){ return "unknown user name."; }
		 */
		System.out.println("password: " + password);
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		String pass = user.getPassword();
		System.out.println(pass);
		if (pass.equals(password)) {

			SaleController.setSesionId(user.getId());
			CartController.setSesionId(user.getId());

			return user.getFullName();
		} else {
			return "wrong password.";
		}
	}

	public void logOut() {
		CartController.setSesionId(0);
		SaleController.setSesionId(0);
	}

	public void upCart(long id) {
		try {
			User user = _userDao.findById(id);
			Cart cart = new Cart();
			cart.setUser(user);
			_cartDao.save(cart);
		} catch (Exception ex) {
			System.out.println("Cart Failed");
		}
	}

}
