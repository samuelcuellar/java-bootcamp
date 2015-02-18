package benja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import benja.models.*;

@Controller
public class StudentController {

	@Autowired
	private StudentDao _studentDao;

	@RequestMapping(value = "/createStudent")
	@ResponseBody
	public String create(String name) {
		try {
			Student student = new Student(name);
			_studentDao.save(student);
		} catch (Exception ex) {
			return "Error creating the course: " + ex.toString();
		}
		return "Student succesfully created!";
	}

	@RequestMapping("/getStudents")
	@ResponseBody
	Iterable<Student> allTeachers() {
		System.out.println("consulta...");
		return _studentDao.findAll();
	}
}
