
public class Demo {
	public static void main(String[] args) {
		
		buildingbuilder bb1 = new housebuildingbuilder();
		buildingdirector bd =  new buildingdirector(bb1);
		bd.constructbuilding();
		building b1 = bd.getbuilding();
		System.out.println("building es: "+b1);
	}

}
