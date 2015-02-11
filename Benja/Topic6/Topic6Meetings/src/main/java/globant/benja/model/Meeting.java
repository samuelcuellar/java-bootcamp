package globant.benja.model;

import java.util.ArrayList;

public class Meeting {
	private Room room;
	private String description;
	private ArrayList<Attendee> attendees;
	private String day;
	private String start;
	private String finish;
	private int number;

	public Meeting(String description, Room room, String day, String start, String finish) {
		this.attendees = new ArrayList<Attendee>();
		this.description = description;
		this.room = room;
		this.day = day;
		this.setStart(start);
		this.setFinish(finish);
	}

	@Override
	public String toString() {
		return "Meeting " + number + ": " + description + " at " + day + " in " + room.getName()
				+ " from " + start + " to " + finish + "\n" + attendees;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public ArrayList<Attendee> getAttendees() {
		return attendees;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

}
