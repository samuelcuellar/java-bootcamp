
public class buildingdirector {
	private buildingbuilder bb = null;
	
	public buildingdirector(buildingbuilder bb){
		this.bb=bb;
	}
	
	public void constructbuilding(){
		bb.buildAddress();
		bb.buildFloors();
		bb.buildRooms();
	}
	
	public building getbuilding(){
		return bb.getBuilding();
	}

}
