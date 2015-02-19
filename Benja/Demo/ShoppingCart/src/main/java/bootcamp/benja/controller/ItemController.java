package bootcamp.benja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bootcamp.benja.dto.ItemDto;
import bootcamp.benja.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService servi;

	@RequestMapping("/newItem")
	@ResponseBody
	public ItemDto newItem(String desc, double price, String category) {
		return servi.newItem(desc, price, category);
	}

	@RequestMapping("/listItems")
	@ResponseBody
	public List<ItemDto> listItem() {
		return servi.listItems();
	}

	@RequestMapping("/listItemsBy")
	@ResponseBody
	public List<ItemDto> listItem(String category) {
		return servi.listItems(category);
	}

}
