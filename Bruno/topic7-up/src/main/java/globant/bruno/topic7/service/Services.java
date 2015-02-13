package globant.bruno.topic7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import globant.bruno.topic7.dao.CourseDao;
import globant.bruno.topic7.dao.StudentDao;
import globant.bruno.topic7.dao.TeacherDao;
import globant.bruno.topic7.model.Course;
import globant.bruno.topic7.model.Student;
import globant.bruno.topic7.model.Teacher;

@Service
public class Services {
	
	@Autowired
	private TeacherDao teacherDao;
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private CourseDao courseDao;
	
	public String createC() {
	    try {
	      Course course = new Course();
	      course.setIdCourse(4);
	      course.setName("Bootcamp");
	      course.setTotalHours(100);
	      course.setIdTeacher(1);
	      courseDao.save(course);
	    }
	    catch (Exception ex) {
	      return "Error creating course: " + ex.toString();
	    }
	    return "Course succesfully created!";
	}
	
	/*public String createT() {
	    try {
	      Teacher teacher = new Teacher();
	      teacher.setFirstName("Lucas");
	      teacher.setLastName("Robles");
	      teacher.setDate_of_Birth(date);
	      teacherDao.save(teacher);
	    }
	    catch (Exception ex) {
	      return "Error creating the user: " + ex.toString();
	    }
	    return "User succesfully created!";
	  }*/
	
	public Iterable<Teacher> allTeacher(){
		  return teacherDao.findAll();
	}
	
	public Iterable<Student> allStudent(){
		  return studentDao.findAll();
	}
	
	public Iterable<Course> allCourse(){
		  return courseDao.findAll();
	}

}
