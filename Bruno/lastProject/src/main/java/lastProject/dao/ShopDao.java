package lastProject.dao;

import java.util.List;

import javax.transaction.Transactional;

import lastProject.model.Shop;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ShopDao extends CrudRepository<Shop, Long> {

	List<Shop> findAll();
}
