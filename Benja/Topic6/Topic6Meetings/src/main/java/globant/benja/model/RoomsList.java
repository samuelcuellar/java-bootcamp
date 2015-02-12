package globant.benja.model;

import java.util.ArrayList;

public class RoomsList {
	private ArrayList<Room> rooms;
	private static RoomsList singleton = null;

	private RoomsList() {
		this.rooms = new ArrayList<Room>();
	}

	public static RoomsList getInstance() {
		if (singleton == null) {
			singleton = new RoomsList();
		}
		return singleton;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	@Override
	public String toString() {
		return "Rooms Availables: \n" + rooms;
	}
}
