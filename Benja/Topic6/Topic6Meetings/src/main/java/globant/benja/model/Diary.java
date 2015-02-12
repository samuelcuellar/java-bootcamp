package globant.benja.model;

import java.util.ArrayList;

public class Diary {

	private ArrayList<Meeting> meeting;
	private static Diary singleton = null;

	private Diary() {
		this.meeting = new ArrayList<Meeting>();
	}

	public static Diary getInstance() {
		if (singleton == null) {
			singleton = new Diary();
		} 
		return singleton;
	}
	
	public ArrayList<Meeting> getMeetings() {
		return meeting;
	}
	
	@Override
	public String toString() {
		return "Meetings Diary: \n" + meeting;
	}
}
