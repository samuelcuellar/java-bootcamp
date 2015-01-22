
public class MedicalInstitutions {
	
	private HospitalBuilder hospitalBuilder;
	
	
	public MedicalInstitutions(HospitalBuilder hospitalBuilder){
		this.hospitalBuilder=hospitalBuilder;
	}
	public void constructHospital(){
		hospitalBuilder.buildFloor();
		hospitalBuilder.buildBedRoom();
		hospitalBuilder.buildElevator();
		hospitalBuilder.buildEmergencyRoom();
		hospitalBuilder.buildIntensiveCareUnit();
		hospitalBuilder.buildMaternityWard();
		hospitalBuilder.buildOperatingRoom();
		hospitalBuilder.buildRecoveryRoom();
		hospitalBuilder.buildWaitingRoom();
	}
	
	public Hospital getHospital(){
		return hospitalBuilder.getHospital();

}
}