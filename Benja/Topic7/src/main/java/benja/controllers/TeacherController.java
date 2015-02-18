package benja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import benja.models.*;

@Controller
public class TeacherController {

	@Autowired
	private TeacherDao _teacherDao;

	@RequestMapping(value = "/createTeacher")
	@ResponseBody
	public String create(String name) {
		try {
			Teacher teacher = new Teacher(name);
			_teacherDao.save(teacher);
		} catch (Exception ex) {
			return "Error creating the teacher: " + ex.toString();
		}
		return "Teacher succesfully created!";
	}

	@RequestMapping("/getTeachers")
	@ResponseBody
	Iterable<Teacher> allTeachers() {
		System.out.println("consulta...");
		return _teacherDao.findAll();
	}

	@RequestMapping("/getTeacher")
	@ResponseBody
	Teacher findTeachers(long id) {
		System.out.println("consulta...");

		return _teacherDao.findById(id);
	}
}
