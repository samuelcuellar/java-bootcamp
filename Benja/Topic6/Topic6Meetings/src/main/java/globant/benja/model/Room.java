package globant.benja.model;

public class Room {
	private int code;
	private String name;
	private int capacity;

	public Room(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
	

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Room " + code + ": " + name + ". Capacity: " + capacity;
	}
}
