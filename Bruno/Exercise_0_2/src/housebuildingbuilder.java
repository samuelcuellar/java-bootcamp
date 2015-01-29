
public class housebuildingbuilder implements buildingbuilder{
	private building b;
	
	public housebuildingbuilder(){
		b = new building();
	}

	public void buildAddress(){
		b.setAddress("Avenida");
	}
	
	public void buildFloors(){
		b.setFloors(1);
	}
	
	public void buildRooms(){
		b.setRooms(4);
	}
	
	public building getBuilding(){
		return b;
	}
	
}
