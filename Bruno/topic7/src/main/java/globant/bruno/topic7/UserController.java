package globant.bruno.topic7;

//import java.util.List;

//import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class UserController {

  @Autowired
  private TeacherDao teacherDao;
  @Autowired
  private StudentDao studentDao;
  @Autowired
  private CourseDao courseDao;

  
  @RequestMapping("/")
	String home() {
      return "Application starts now";
  }
  
  @RequestMapping("/createC")
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
  
  /*@RequestMapping("/createT")
  public String createT() {
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
  
  @RequestMapping("/getT")
  Iterable<Teacher> allTeacher(){
	  return teacherDao.findAll();
  }
  
  @RequestMapping("/getS")
  Iterable<Student> allStudent(){
	  return studentDao.findAll();
  }
  
  @RequestMapping("/getC")
  Iterable<Course> allCourse(){
	  return courseDao.findAll();
  }
  
  public static void main (String [] args) throws Exception{
		SpringApplication.run(UserController.class, args);
	}

} 

