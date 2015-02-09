package globant.benja.model;

import java.util.ArrayList;

public class ClientList {
	private ArrayList<User> users;
	private static ClientList singleton = null;

	private ClientList() {
		this.users = new ArrayList<User>();
	}

	public static ClientList getInstance() {
		if (singleton == null) {
			singleton = new ClientList();
		} 
		return singleton;
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}
	
	@Override
	public String toString() {
		return "Store Clients: \n" + users;
	}
}
