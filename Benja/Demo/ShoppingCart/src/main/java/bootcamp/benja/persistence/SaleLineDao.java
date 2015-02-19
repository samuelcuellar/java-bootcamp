package bootcamp.benja.persistence;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import bootcamp.benja.model.SaleLine;

@Transactional
public interface SaleLineDao extends CrudRepository<SaleLine, Long> {

}
