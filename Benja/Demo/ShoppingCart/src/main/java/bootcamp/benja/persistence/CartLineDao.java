package bootcamp.benja.persistence;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import bootcamp.benja.model.CartLine;

@Transactional
public interface CartLineDao extends CrudRepository<CartLine, Long> {

	// public Item findByCode(long code);
}
