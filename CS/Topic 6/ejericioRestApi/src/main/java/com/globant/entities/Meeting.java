package com.globant.entities;

public class Meeting {

	private Atendees atendees;
	private Room room;
	private SlotTime st;

	public Meeting(Atendees atendees, Room room, SlotTime st) {

		this.atendees = atendees;
		this.room = room;
		this.st = st;
	}

	public Meeting(String atendees2, int roomNumber, int slot) {
		// TODO Auto-generated constructor stub
	}

	public Atendees getAtendees() {
		return atendees;
	}

	public void setAtendees(Atendees atendees) {
		this.atendees = atendees;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public SlotTime getSt() {
		return st;
	}

	public void setSt(SlotTime st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "Meeting [atendees=" + atendees + ", room=" + room + ", st=" + st + "]";
	}

}
