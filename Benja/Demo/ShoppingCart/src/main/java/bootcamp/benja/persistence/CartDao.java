package bootcamp.benja.persistence;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import bootcamp.benja.model.Cart;

@Transactional
public interface CartDao extends CrudRepository<Cart, Long>{
	
	//public Item findByCode(long code);
}

