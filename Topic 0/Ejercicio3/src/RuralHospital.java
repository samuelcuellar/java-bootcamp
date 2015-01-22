public class RuralHospital implements HospitalBuilder {

	private Hospital hospital;

	public RuralHospital() {
		hospital = new Hospital();
	}

	@Override
	public void buildFloor() {
		hospital.setFloor(1);
	}

	@Override
	public void buildBedRoom() {
		hospital.setBedroom(20);
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

	public Hospital getHospital() {

		return hospital;
	}

	@Override
	public void buildMaternityWard() {
		hospital.setMaternityWard('N');
	}

	@Override
	public void buildElevator() {
		hospital.setElevator('N');
	}

	@Override
	public void buildOperatingRoom() {
		hospital.setOperatingRoom('N');
	}

	@Override
	public void buildRecoveryRoom() {
		hospital.setRecoveryRoom('N');
	}

}
