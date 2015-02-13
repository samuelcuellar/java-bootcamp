package globant.bruno.topic7;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course, Long> {
	
	List<Course> findAll();

}
