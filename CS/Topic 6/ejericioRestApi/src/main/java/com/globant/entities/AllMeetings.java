package com.globant.entities;

import java.util.ArrayList;

public class AllMeetings {

	ArrayList<Meeting> allm = new ArrayList<Meeting>();

	public AllMeetings() {

	}

	public ArrayList<Meeting> getAllm() {
		return allm;
	}

	public void setAllm(ArrayList<Meeting> allm) {
		this.allm = allm;
	}

	public void addToAllMeetings(Meeting m) {
		allm.add(m);
	}

	public void deleteMeetings(Meeting m) {
		allm.remove(m);
	}

	public void ListMeetings() {
		System.out.println("The list of meetings:");
		for (Meeting m : allm) {
			System.out.println(m.toString());
		}
	}
}
