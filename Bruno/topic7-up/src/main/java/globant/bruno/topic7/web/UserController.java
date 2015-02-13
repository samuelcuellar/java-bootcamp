package globant.bruno.topic7.web;

import globant.bruno.topic7.model.Course; 
import globant.bruno.topic7.model.Student;
import globant.bruno.topic7.model.Teacher;
import globant.bruno.topic7.service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
  @Autowired
  Services service;
   
  @RequestMapping("/")
  String home() {
      return "Application starts now";
  }
  
  @RequestMapping("/createC")
  public String createCourse() {
    return service.createC();
  }
  
  /*@RequestMapping("/createT")
  public String createTeacher() {
 	return service.createT();
  }*/
  
  @RequestMapping("/getT")
  Iterable<Teacher> getAllTeacher(){
	  return service.allTeacher();
  }
  
  @RequestMapping("/getS")
  Iterable<Student> getAllStudent(){
	  return service.allStudent();
  }
  
  @RequestMapping("/getC")
  Iterable<Course> getAllCourse(){
	  return service.allCourse();
  }
  
} 

