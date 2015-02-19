package bootcamp.benja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bootcamp.benja.service.UserService;

@Controller
public class UserController extends GlobalController {

	@Autowired
	private UserService servi;

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		String mensaje = new String("--- Proyecto: LogIn-LogOut ---"
				+ " Data Base: db_futbol ---" + " Get Started! --- insert url:");
		return mensaje;
	}

	@RequestMapping("/userRegistration")
	@ResponseBody
	public String userRegistration(String fullName, String email,
			String userName, String password, String repitePassword) {
		
		long id;

		id = servi.registrateUser(fullName, email, userName, password,
				repitePassword);
		if (id == 0) {

			return "Registration failed";
		} else {
			servi.upCart(id);
			return "New User: " + servi.showUser(id);
		}
	}

	@RequestMapping("/logIn")
	@ResponseBody
	public String logIn(String userName, String password) {
		servi.logOut();
		return " " + servi.logInUser(userName, password);
	}

	@RequestMapping("/logOut")
	@ResponseBody
	public String disconnect() {

		servi.logOut();

		return "Sesion Terminate..";

	}

	@RequestMapping("/tryConnection")
	@ResponseBody
	public String tryConnection() {

		if (sesionId != 0) {
			return "Current Log: " + sesionId;
		} else {
			return "Please, logIn.";
		}
	}

}
