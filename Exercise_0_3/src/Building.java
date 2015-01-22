public class Building {

	private String name;
	private String address;
	private int floors;
	private int rooms;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String add) {
		address = add;
	}

	public String getAddress() {
		return address;
	}

	public void setFloors(int f) {
		floors = f;
	}

	public int getFloors() {
		return floors;
	}

	public void setRooms(int r) {
		rooms = r;
	}

	public int getRooms() {
		return rooms;
	}

	public String toString() {
		return "name: " + name + ", address: " + address + ", floors: " + floors + ", rooms: " + rooms;
	}
}
