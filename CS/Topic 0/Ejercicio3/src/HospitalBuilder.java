public interface HospitalBuilder {

	public void buildFloor();

	public void buildBedRoom();

	public void buildIntensiveCareUnit();

	public void buildWaitingRoom();

	public void buildEmergencyRoom();

	public void buildMaternityWard();

	public void buildElevator();

	public void buildOperatingRoom();

	public void buildRecoveryRoom();
	
	public Hospital getHospital();
}
