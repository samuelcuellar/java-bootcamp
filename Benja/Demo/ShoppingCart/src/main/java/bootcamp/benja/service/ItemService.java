package bootcamp.benja.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamp.benja.dto.ItemDto;
import bootcamp.benja.model.Item;
import bootcamp.benja.persistence.ItemDao;

@Service
public class ItemService {

	@Autowired
	private ItemDao _itemDao;

	// alta de item a la base de datos
	public ItemDto newItem(String desc, double price, String category) {
		ItemDto itemDto;
		try {
			Item item = new Item(desc, price, category);
			_itemDao.save(item);
			itemDto = convertToDto(item);
			return itemDto;
		} catch (Exception ex) {
			System.out.println("Add a new Item failed...");
			return itemDto = new ItemDto();
		}
	}

	private ItemDto convertToDto(Item item) {
		ItemDto itemdto = new ItemDto();
		itemdto.setCode(item.getCode());
		itemdto.setDescription(item.getDescription());
		itemdto.setPrice(item.getPrice());

		return itemdto;
	}

	// list items
	public List<ItemDto> listItems() {

		ArrayList<ItemDto> itemsDto = new ArrayList<ItemDto>();
		Iterable<Item> items = _itemDao.findAll();
		itemsDto = generateArray(itemsDto, items);
		return itemsDto;

	}

	public List<ItemDto> listItems(String category) {

		ArrayList<ItemDto> itemsDto = new ArrayList<ItemDto>();
		Iterable<Item> items = _itemDao.findAll();
		itemsDto = generateCategoryArray(itemsDto, items,category);

		return itemsDto;
	}

	private ArrayList<ItemDto> generateArray(
			ArrayList<ItemDto> itemsDto, Iterable<Item> items) {
		ItemDto itemDto;
		for (Item i : items) {
			
			itemDto = convertToDto(i);
			itemsDto.add(itemDto);
		}
		return itemsDto;
	}

	public ArrayList<ItemDto> generateCategoryArray(ArrayList<ItemDto> itemsDto,
			Iterable<Item> items, String category) {
		ItemDto itemDto;
		for (Item i : items) {
			if(i.getCategory().equals(category)){
				itemDto = convertToDto(i);
				itemsDto.add(itemDto);
			}
		}
		return itemsDto;
	}

}
