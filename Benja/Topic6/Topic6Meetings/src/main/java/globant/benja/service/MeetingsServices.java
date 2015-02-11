package globant.benja.service;

import org.springframework.stereotype.Service;

import globant.benja.model.*;

@Service
public class MeetingsServices {

	public void addRoom(String name, int capacity) {
		System.out.println("New Room");

		RoomsList list = RoomsList.getInstance();

		Room room = new Room(name, capacity);

		int j = 0;
		for (Room i : list.getRooms()) {
			j = i.getCode();
		}
		room.setCode(j + 1);
		list.getRooms().add(room);

		System.out.println(list);
	}

	public void addAttendee(String name, int dni) {
		System.out.println("New Attendee");

		AttendeesList list = AttendeesList.getInstance();

		Attendee attendee = new Attendee(name, dni);

		int j = 0;
		for (Attendee i : list.getAttendees()) {
			j = i.getId();
		}
		attendee.setId(j + 1);
		list.getAttendees().add(attendee);

		System.out.println(list);
	}

	public void createMeeting(String desc, int roomCode, String day,
			String start, String finish) {

		System.out.println("New Meeting");

		// buscar room
		RoomsList rooms = RoomsList.getInstance();
		Room room = null;
		for (Room r : rooms.getRooms()) {
			if (r.getCode() == roomCode) {
				room = r;
				// System.out.println(room);
			}
		}

		Meeting meeting = new Meeting(desc, room, day, start, finish);
		Diary list = Diary.getInstance();
		int j = 0;
		for (Meeting i : list.getMeetings()) {
			j = i.getNumber();
		}
		meeting.setNumber(j + 1);
		list.getMeetings().add(meeting);

		System.out.println(list);
	}

	public void addAttendeeToMeeting(int meetingNumber, int idAttendee) {

		System.out.println("add Attendee To Meeting");
		// buscar la meeting
		Diary diary = Diary.getInstance();
		Meeting meeting = null;
		for (Meeting m : diary.getMeetings()) {
			if (m.getNumber() == meetingNumber) {
				meeting = m;
				System.out.println(meeting);
			}
		}
		// buscar el att
		AttendeesList attendeesList = AttendeesList.getInstance();
		Attendee attendee = null;
		for (Attendee a : attendeesList.getAttendees()) {
			if (a.getId() == idAttendee) {
				attendee = a;
				System.out.println(attendee);
			}
		}
		// meeting.getAttendees.add(att);
		meeting.getAttendees().add(attendee);
	}

	public void deleteMeeting(int delete) {
		System.out.println("\ndelete meeting.");
		Diary diary = Diary.getInstance();
		Meeting rem = null;
		for (Meeting m : diary.getMeetings()) {
			if (m.getNumber() == delete) {
				rem = m;
			}
		}
		diary.getMeetings().remove(rem);
		System.out.println(diary);
	}
	
	public Diary getDiary(){
		Diary diary = Diary.getInstance();	
		return diary;
	}
	public RoomsList getRoomsList(){
		RoomsList rooms = RoomsList.getInstance();
		return rooms;
	}
	public AttendeesList getAttendeesList(){
		AttendeesList attendeesList = AttendeesList.getInstance();
		return attendeesList;
	}
	
}
