package lastProject.dao;

import java.util.List;

import javax.transaction.Transactional;

import lastProject.model.Category;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CategoryDao extends CrudRepository<Category, Long> {

	List<Category> findAll();
}
