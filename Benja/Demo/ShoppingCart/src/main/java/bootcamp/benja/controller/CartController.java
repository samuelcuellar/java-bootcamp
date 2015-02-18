package bootcamp.benja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bootcamp.benja.service.CartService;

@Controller
public class CartController extends GlobalController {

	@Autowired
	private CartService servi;
	
	@RequestMapping("/cart")
	@ResponseBody
	public String index() {
		if(sesionId != 0){
			return "cart is ready to use, under sesion Id: " + sesionId;
		}else{
			return "Please, logIn.";
		}
	}
	
	@RequestMapping("/addItem")
	@ResponseBody
	public String addItem(long code,int quantity) {
		if(sesionId != 0){
			
			return servi.addItem(code,sesionId, quantity);
		}else{
			return "Please, logIn.";
		}
	}
	
	@RequestMapping("/deleteItem")
	@ResponseBody
	public String deleteItem(long code) {
		if(sesionId != 0){
			return servi.deleteItem(sesionId,code);
		}else{
			return "Please, logIn.";
		}
	}
	
	@RequestMapping("/listMyCart")
	@ResponseBody
	public List<String> listMyCard() {
		if(sesionId != 0){
			return servi.listMyCard(sesionId);
		}else{
			List<String> message = new ArrayList<String>();
			message.add("Please, logIn.");
			return message;
		}
	}
	
	@RequestMapping("/emptyMyCart")
	@ResponseBody
	public String emptyMyCart() {
		if(sesionId != 0){
			return servi.emptyMyCard(sesionId);
		}else{
			return "Please, logIn.";
		}
	}
}
