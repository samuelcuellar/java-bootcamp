package bootcamp.benja.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamp.benja.model.Item;
import bootcamp.benja.persistence.ItemDao;

@Service
public class ItemService {

	@Autowired
	private ItemDao _itemDao;

	// alta de item a la base de datos
	public String newItem(String desc, double price, String category) {
		try {
			Item item = new Item(desc, price, category);
			_itemDao.save(item);
			String message = item.getCode() + " " + item.getDescription()
					+ " (" + item.getCategory() + ") $" + item.getPrice();
			return message;
		} catch (Exception ex) {
			return "Add a new Item failed...";
		}
	}

	// list items
	public List<String> listItems() {
		ArrayList<String> itemsMessage = new ArrayList<String>();
		String itemMessage;
		
		Iterable<Item> items = _itemDao.findAll();
		for (Item i : items){
			
			itemMessage = "" + i.getCode() + " " + i.getDescription()
					+ " (" + i.getCategory() + ")...$" + i.getPrice();
			itemsMessage.add(itemMessage);
		}
		
		return itemsMessage;
	}
	
	public List<String> listItems(String category) {
		ArrayList<String> itemsMessage = new ArrayList<String>();
		String itemMessage;
		
		Iterable<Item> items = _itemDao.findAll();
		for (Item i : items){
			
			itemMessage = "" + i.getCode() + " " + i.getDescription()
					+ " (" + i.getCategory() + ")...$" + i.getPrice();
			
			if(i.getCategory().equals(category)){
				itemsMessage.add(itemMessage);
			}
		}
		
		return itemsMessage;
	}
}
