package bootcamp.benja.persistence;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import bootcamp.benja.model.Sale;

@Transactional
public interface SaleDao extends CrudRepository<Sale, Long> {

}
