package lastProject.dao;

import java.util.List;

import javax.transaction.Transactional;

import lastProject.model.User;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

	List<User> findAll();

	User findByEmail(String email);
}
