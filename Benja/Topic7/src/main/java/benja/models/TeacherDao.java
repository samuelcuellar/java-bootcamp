package benja.models;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

//@Repository
@Transactional
public interface TeacherDao extends CrudRepository<Teacher, Long> {
	/*
	 * @PersistenceContext private EntityManager _entityManager;
	 * 
	 * public void create(Teacher teacher) { _entityManager.persist(teacher);
	 * return; }
	 * 
	 * @SuppressWarnings("unchecked") public List<Teacher> getAll() { return
	 * _entityManager.createQuery("select * from teachers").getResultList(); }
	 */
	
	Teacher findById(long id);
}
