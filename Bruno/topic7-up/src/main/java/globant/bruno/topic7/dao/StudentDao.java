package globant.bruno.topic7.dao;

import globant.bruno.topic7.model.Student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface StudentDao extends CrudRepository<Student, Long>{
	
	List<Student> findAll();

    List<Student> findByLastName(String lastName);

}
