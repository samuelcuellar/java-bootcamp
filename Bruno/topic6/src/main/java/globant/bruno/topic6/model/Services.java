package globant.bruno.topic6.model;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Services {
		
	ArrayList<Pacient>list=new ArrayList<Pacient>();
	ArrayList<Room>list2=new ArrayList<Room>();
	ArrayList<Meeting>list3=new ArrayList<Meeting>();
	
	public void addMeeting(String last_name,int number, int t){
		Meeting m = new Meeting(getPacient(last_name),getRoom(number),t);
		list3.add(m);
	}
	
	public Meeting getMeeting(String last_name){
		Meeting m = null;
		boolean exist=false;
		for(int i=0; i<list3.size();i++){
			m = (Meeting)list3.get(i);
			if(m.getPacient().getLast_name()==last_name){
			 exist=true;
			}
			if(exist==true){
				return m;
			}
		}
		return null;
	}
	
	public void updateMeeting(String last_name, int newTime) {
		for (int i = 0; i < list3.size(); i++) {
			Meeting m = (Meeting) list3.get(i);
			if (m.getPacient().getLast_name().equals(last_name)) {
				m.setTime(newTime);
				break;
			}
		}
	}
	
	public void removeMeeting(String last_name){
		for(int i=0; i<list3.size();i++){
			Meeting m = (Meeting)list3.get(i);
			if(m.getPacient().getLast_name()==last_name){
				list3.remove(i);
			}
		}
	}
	public void addPacient(String name, String last_name){
		Pacient p = new Pacient(name,last_name);
		list.add(p);
	}
	
	public Pacient getPacient(String last_name){
		Pacient p = null;
		boolean exist=false;
		for(int i=0; i<list.size();i++){
			p = (Pacient)list.get(i);
			if(p.getLast_name()==last_name){
			 exist=true;
			}
			if(exist==true){
				return p;
			}
		}
		return null;
	}
	
	public ArrayList<Meeting> getMeetingList(){
		return list3;
	}
	
	public void addRoom(int number){
		Room r = new Room(number);
		list2.add(r);
	}
	
	public Room getRoom(int number){
		Room r = null;
		boolean exist=false;
		for(int i=0; i<list2.size();i++){
			r = (Room)list2.get(i);
			if(r.getNumber()==number){
			 exist=true;
			}
			if(exist==true){
				return r;
			}
		}
		return null;
	}
}
