public class Demo {
	public static void main(String[] args) {

		BuildingBuilder bb1 = new HospitalBuildingBuilder();
		BuildingDirector bd = new BuildingDirector(bb1);
		bd.constructBuilding();
		Building b1 = bd.getBuilding();
		System.out.println("building es: " + b1);
	}

}