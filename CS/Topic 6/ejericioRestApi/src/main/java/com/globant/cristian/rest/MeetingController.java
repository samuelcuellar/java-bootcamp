package com.globant.cristian.rest;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.globant.entities.AllMeetings;
import com.globant.entities.Atendees;
import com.globant.entities.Meeting;
import com.globant.entities.Room;
import com.globant.entities.SlotTime;

@RestController
@EnableAutoConfiguration
public class MeetingController {

	Atendees at = new Atendees("Juan Pedro");
	Room roomM = new Room(303);
	SlotTime st = new SlotTime(2);
	Meeting meeting = new Meeting(at.getAtendees(), roomM.getRoomNumber(), st.getSlot());
	AllMeetings allm = new AllMeetings();

	@RequestMapping("/CreateMeeting")
	public void createMeeting() {
		allm.addToAllMeetings(meeting);
		allm.ListMeetings();
	}

	@RequestMapping("/queryExistingMeeting")
	public String queryExistingMeetings() {
		return "Las Reuniones son:" + "Atendees:" + meeting.getAtendees() + "Room: " + meeting.getRoom() + "Slot Time: " + meeting.getSt();
	}

	@RequestMapping("/DeleteExistingMeeting")
	public void deleteExistingMeetings() {
		allm.deleteMeetings(meeting);

	}
}
