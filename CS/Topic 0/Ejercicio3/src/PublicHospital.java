public class PublicHospital implements HospitalBuilder {

	private Hospital hospital;

	public PublicHospital() {
		hospital = new Hospital();
	}

	public Hospital getHospital() {

		return hospital;
	}

	@Override
	public void buildFloor() {
		hospital.setFloor(2);
	}

	@Override
	public void buildBedRoom() {
		hospital.setBedroom(100);
	}

	@Override
	public void buildIntensiveCareUnit() {
		hospital.setIntensiveCareUnit('Y');
	}

	@Override
	public void buildWaitingRoom() {
		hospital.setWaitingRoom('Y');
	}

	@Override
	public void buildEmergencyRoom() {
		hospital.setEmergencyRoom('Y');
	}

	@Override
	public void buildMaternityWard() {
		hospital.setMaternityWard('Y');
	}

	@Override
	public void buildElevator() {
		hospital.setElevator('N');
	}

	@Override
	public void buildOperatingRoom() {
		hospital.setOperatingRoom('Y');
	}

	@Override
	public void buildRecoveryRoom() {
		hospital.setRecoveryRoom('Y');
	}

}
