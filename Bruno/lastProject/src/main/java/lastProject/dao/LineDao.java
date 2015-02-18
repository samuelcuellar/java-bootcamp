package lastProject.dao;

import java.util.List;

import javax.transaction.Transactional;

import lastProject.model.Line;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface LineDao extends CrudRepository<Line, Long> {

	List<Line> findAll();
}
