package benja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import benja.models.*;

@Controller
public class CourseController {

	@Autowired
	private CourseDao _courseDao;

	@RequestMapping(value = "/createCourse")
	@ResponseBody
	public String create(String desc, int hours) {
		try {
			Course course = new Course(desc, hours);
			_courseDao.save(course);
		} catch (Exception ex) {
			return "Error creating the course: " + ex.toString();
		}
		return "Course succesfully created!";
	}

	@RequestMapping("/getCourses")
	@ResponseBody
	Iterable<Course> allTeachers() {
		System.out.println("consulta...");
		return _courseDao.findAll();
	}
}
