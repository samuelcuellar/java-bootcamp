package bootcamp.benja.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamp.benja.dto.SaleDto;
import bootcamp.benja.dto.SaleLineDto;
import bootcamp.benja.model.CartLine;
import bootcamp.benja.model.Sale;
import bootcamp.benja.model.SaleLine;
import bootcamp.benja.model.User;
import bootcamp.benja.persistence.CartDao;
import bootcamp.benja.persistence.CartLineDao;
import bootcamp.benja.persistence.ItemDao;
import bootcamp.benja.persistence.SaleDao;
import bootcamp.benja.persistence.SaleLineDao;
import bootcamp.benja.persistence.UserDao;

@Service
public class SaleService {

	@Autowired
	private CartDao _cartDao;
	@Autowired
	private CartLineDao _lineDao;
	@Autowired
	private ItemDao _itemDao;
	@Autowired
	private UserDao _userDao;
	@Autowired
	private SaleLineDao _saleLineDao;
	@Autowired
	private SaleDao _saleDao;

	public SaleDto buyCart(String holder, long cardNumber, int security,
			long sesionId) {

		// buscar el user
		User user = _userDao.findById(sesionId);

		// crear sale
		Sale sale = new Sale(holder, cardNumber, security);
		sale.setUser(user);

		
		SaleLineDto lineDto;
		List<SaleLineDto> linesDto = new ArrayList<SaleLineDto>();
		
		double total = 0;
		SaleLine saleLine;
		for (CartLine cartLine : user.getCart().getLines()) {
			saleLine = new SaleLine();
			saleLine.setItem(cartLine.getItem());
			saleLine.setQuantity(cartLine.getQuantity());
			saleLine.setSubtotal(cartLine.getQuantity()
					* cartLine.getItem().getPrice());

			total = total + saleLine.getSubtotal();
			// agregar linea a la venta

			sale.getLines().add(saleLine);
			_saleDao.save(sale);
			saleLine.setSale(sale);

			_saleLineDao.save(saleLine);
			
			lineDto = new SaleLineDto();
			lineDto = convertLineToDto(saleLine);
			
			linesDto.add(lineDto);
		}
		sale.setTotal(total);
		_saleDao.save(sale);

		SaleDto saleDto = convertSaleToDto(sale);
		saleDto.setLines(linesDto);
		return saleDto;
	}

	private SaleDto convertSaleToDto(Sale sale) {
		SaleDto dto = new SaleDto();
		dto.setCardNumber(sale.getCardNumber());
		dto.setHolder(sale.getHolder());
		dto.setNumber(sale.getNumber());
		dto.setSecurity(sale.getSecurity());
		dto.setTotal(sale.getTotal());
		
		return dto;
	}

	private SaleLineDto convertLineToDto(SaleLine saleLine) {
		SaleLineDto dto = new SaleLineDto();
		dto.setId(saleLine.getItem().getCode());
		dto.setQuantity(saleLine.getQuantity());
		dto.setSubtotal(saleLine.getSubtotal());
		return dto;
	}

}
