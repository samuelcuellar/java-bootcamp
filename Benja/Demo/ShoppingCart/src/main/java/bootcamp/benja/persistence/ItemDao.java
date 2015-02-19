package bootcamp.benja.persistence;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import bootcamp.benja.model.*;

@Transactional
public interface ItemDao extends CrudRepository<Item, Long> {

	public Item findByCode(long code);
}
