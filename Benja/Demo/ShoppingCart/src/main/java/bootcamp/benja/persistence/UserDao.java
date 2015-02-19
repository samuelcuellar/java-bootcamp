package bootcamp.benja.persistence;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import bootcamp.benja.model.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

	User findById(long id);

	User findByUserName(String userName);

}