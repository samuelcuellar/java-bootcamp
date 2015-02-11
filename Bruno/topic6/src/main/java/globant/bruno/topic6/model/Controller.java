package globant.bruno.topic6.model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class Controller {
	
	@Autowired
	Services service;
	
	@RequestMapping("/")
	String home() {
		service.addPacient("bruno","giordano");
		service.addPacient("matias","raimondo");
		service.addPacient("andres","mansilla");
		service.addRoom(10);
		service.addRoom(20);
		service.addRoom(30);
        return "Application starts now";
    }
	
	@RequestMapping("/addM")
	public void addM(){
		service.addMeeting("giordano",20,2);
		service.addMeeting("raimondo",10,4);
		service.addMeeting("mansilla",30,6);
	}
	
	@RequestMapping("/getM")
	public Meeting getM(){
		return service.getMeeting("giordano");
	}
	
	@RequestMapping("/getAll")
	public ArrayList<Meeting> getAll(){
		return service.getMeetingList();
	}
	
	@RequestMapping("/updateM")
	public void updateM(){
		service.updateMeeting("giordano",4);
	}
	
	@RequestMapping("/deleteM")
	public void deleteM(){
		service.removeMeeting("giordano");
	}
	
	public static void main (String [] args) throws Exception{
		SpringApplication.run(Controller.class, args);
	}
}
