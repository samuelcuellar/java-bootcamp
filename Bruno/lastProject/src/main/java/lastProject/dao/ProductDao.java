package lastProject.dao;

import java.util.List;

import javax.transaction.Transactional;

import lastProject.model.Product;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ProductDao extends CrudRepository<Product, Long> {

	List<Product> findAll();
}
