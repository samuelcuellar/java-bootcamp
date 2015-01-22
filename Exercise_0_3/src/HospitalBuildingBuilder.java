public class HospitalBuildingBuilder implements BuildingBuilder {
	private Building b;

	public HospitalBuildingBuilder() {
		b = new Building();
	}

	public void buildName() {
		b.setName("Hospital");
	}
	
	public void buildAddress() {
		b.setAddress("Mendoza 132");
	}

	public void buildFloors() {
		b.setFloors(3);
	}

	public void buildRooms() {
		b.setRooms(100);
	}

	public Building getBuilding() {
		return b;
	}

}