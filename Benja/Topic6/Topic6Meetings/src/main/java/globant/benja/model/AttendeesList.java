package globant.benja.model;

import java.util.ArrayList;

public class AttendeesList {
	private ArrayList<Attendee> attendees;
	private static AttendeesList singleton = null;

	private AttendeesList() {
		this.attendees = new ArrayList<Attendee>();
	}

	public static AttendeesList getInstance() {
		if (singleton == null) {
			singleton = new AttendeesList();
		}
		return singleton;
	}

	public ArrayList<Attendee> getAttendees() {
		return attendees;
	}

	@Override
	public String toString() {
		return "Registered Attendees: \n" + attendees;
	}
}
