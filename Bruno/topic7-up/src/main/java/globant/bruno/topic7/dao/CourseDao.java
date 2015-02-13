package globant.bruno.topic7.dao;

import globant.bruno.topic7.model.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course, Long> {
	
	List<Course> findAll();

}
