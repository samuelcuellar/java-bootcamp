package globant.benja;

import globant.benja.service.MeetingsServices;

import org.junit.Test;

public class TestMeetingsServices {
	/*
	@Test
	public void test1Rooms(){
		MeetingsServices serv = new MeetingsServices();
		serv.addRoom("Sala A",5);
		serv.addRoom("Sala B",6);
	}
	
	@Test
	public void test2Attendees(){
		MeetingsServices serv = new MeetingsServices();
		serv.addAttendee("Juan Perez",12345675);
		serv.addAttendee("Milagros Correa",52561436);
		serv.addAttendee("Fiorella Alicata",35026860);
	}
	
	@Test
	public void test3altaMeeting(){
		MeetingsServices serv = new MeetingsServices();
		serv.createMeeting("Reunion semanal ordinaria",1,"2015-01-12","08:00","09:00");	
	}
	
	@Test
	public void test4addAttendeesToMeeting(){
		MeetingsServices serv = new MeetingsServices();
		serv.addAttendeeToMeeting(1,2);
	}
	*/
	@Test
	public void allTest(){
		MeetingsServices serv = new MeetingsServices();
		serv.addRoom("Sala A",5);
		
		serv.addAttendee("Juan Perez",12345675);
		serv.addAttendee("Milagros Correa",52561436);
		serv.addAttendee("Fiorella Alicata",35026860);
		

		serv.createMeeting("Reunion semanal ordinaria",1,"2015-01-12","08:00","09:00");	
		
		serv.addAttendeeToMeeting(1,1);
		serv.addAttendeeToMeeting(1,2);
		serv.addAttendeeToMeeting(1,3);
		
		serv.deleteMeeting(1);
	}
	
	
}
