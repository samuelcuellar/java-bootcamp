package globant.bruno.topic6.model;

public class Meeting {

	Pacient pacient;
	Room room;
	int time;
	
	public Meeting(Pacient pacient, Room room, int time){
		this.pacient=pacient;
		this.room=room;
		this.time=time;
	}

	public Pacient getPacient() {
		return pacient;
	}

	public void setPacient(Pacient pacient) {
		this.pacient = pacient;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
