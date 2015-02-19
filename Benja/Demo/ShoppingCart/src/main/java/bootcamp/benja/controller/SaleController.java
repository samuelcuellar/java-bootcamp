package bootcamp.benja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bootcamp.benja.dto.SaleDto;
import bootcamp.benja.service.CartService;
import bootcamp.benja.service.SaleService;

@Controller
public class SaleController extends GlobalController {

	@Autowired
	private SaleService servi;
	@Autowired
	private CartService serviCart;

	/*
	 * @RequestMapping("/buy")
	 * 
	 * @ResponseBody public String buy() { if (sesionId != 0) { return
	 * "you r ready to buy, under sesion Id: " + sesionId; } else { return
	 * "Please, logIn."; } }
	 */

	@RequestMapping("/buyMyCart")
	@ResponseBody
	public SaleDto buyMyCart(String holder, long cardNumber, int security) {
		if (sesionId != 0) { 

			return servi.buyCart(holder, cardNumber, security,
					sesionId);
		} else {
			return new SaleDto();
		}
	}

}
