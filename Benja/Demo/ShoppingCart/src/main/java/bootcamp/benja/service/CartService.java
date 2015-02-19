package bootcamp.benja.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamp.benja.model.Cart;
import bootcamp.benja.model.CartLine;
import bootcamp.benja.model.Item;
import bootcamp.benja.model.User;
import bootcamp.benja.persistence.CartDao;
import bootcamp.benja.persistence.CartLineDao;
import bootcamp.benja.persistence.ItemDao;
import bootcamp.benja.persistence.UserDao;

@Service
public class CartService {

	@Autowired
	private CartDao _cartDao;
	@Autowired
	private CartLineDao _lineDao;
	@Autowired
	private ItemDao _itemDao;
	@Autowired
	private UserDao _userDao;

	public String addItem(long id, long sesionId, int quantity) {

		// find user cart
		User user = _userDao.findById(sesionId);
		// find item
		Item item = _itemDao.findByCode(id);

		// add cart line
		CartLine line = new CartLine(item, quantity);
		_lineDao.save(line);

		// set line and cart
		Cart cart = user.getCart();
		cart.setUser(user);

		line.setCart(cart);

		cart.getLines().add(line);

		_lineDao.save(line);
		_cartDao.save(cart);

		return line.getQuantity() + " " + line.getItem().getDescription()
				+ "Added to cart!";
	}

	public List<String> listMyCard(long sesionId) {

		// find user cart
		System.out.println("listing cart...");
		User user = _userDao.findById(sesionId);
		System.out.println("user cart: " + user.getFullName());
		double total = 0;
		List<String> message = new ArrayList<String>();

		for (CartLine line : user.getCart().getLines()) {
			total = total + (line.getItem().getPrice() * line.getQuantity());
			message.add(line.getItem().getDescription() + " $"
					+ line.getItem().getPrice() + " x" + line.getQuantity());
		}
		message.add("total: $" + total);
		return message;
	}

	public String deleteItem(long sesionId, long code) {

		// hacer dsp

		return "Service temporally unavailable";
	}

	public String emptyMyCard(long sesionId) {

		Iterable<CartLine> lines = _lineDao.findAll();
		User user = _userDao.findById(sesionId);

		for (CartLine l : lines) {

			if (l.getCart().getUser() == user) {
				_lineDao.delete(l);
			}
		}

		user.getCart().getLines().clear();
		_userDao.save(user);

		return "Cart Restored";
	}
}
