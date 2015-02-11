package globant.benja;

import globant.benja.model.*;
import globant.benja.service.MeetingsServices;

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
	MeetingsServices serv;

	@RequestMapping("/")
	String home() {
		return "Todo Ok!";
	}
	
	@RequestMapping("/createRoom")
	RoomsList createRoom() {
		serv.addRoom("Sala Vip", 4);
		serv.addRoom("Sala Gerencial", 10);
		return serv.getRoomsList();
	}
	@RequestMapping("/createAttendee")
	AttendeesList createAttendee() {
		serv.addAttendee("Juan Perez",12345675);
		serv.addAttendee("Milagros Correa",52561436);
		serv.addAttendee("Fiorella Alicata",35026860);
		return serv.getAttendeesList();
	}
	@RequestMapping("/createMeeting")
	Diary createMeeting() {
		serv.createMeeting("Reunion semanal ordinaria",1,"2015-01-12","08:00","09:00");	
		serv.addAttendeeToMeeting(1,1);
		serv.addAttendeeToMeeting(1,2);
		serv.addAttendeeToMeeting(1,3);
		
		return serv.getDiary();
	}
	@RequestMapping("/deleteMeeting")
	Diary deleteMeeting() {
		serv.deleteMeeting(1);
		return serv.getDiary();
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Controller.class, args);
	}
}
