package benja.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface StudentDao extends CrudRepository<Student, Long> {
	
}
