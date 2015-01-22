public class BuildingDirector {
	private BuildingBuilder bb = null;

	public BuildingDirector(BuildingBuilder bb) {
		this.bb = bb;
	}

	public void constructBuilding() {
		bb.buildName();
		bb.buildAddress();
		bb.buildFloors();
		bb.buildRooms();
	}

	public Building getBuilding() {
		return bb.getBuilding();
	}

}
