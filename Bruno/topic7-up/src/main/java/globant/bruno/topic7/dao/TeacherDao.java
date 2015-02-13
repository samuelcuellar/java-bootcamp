package globant.bruno.topic7.dao;

import globant.bruno.topic7.model.Teacher;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface TeacherDao extends CrudRepository<Teacher, Long>{
	
	List<Teacher> findAll();

    List<Teacher> findByLastName(String lastName);
}