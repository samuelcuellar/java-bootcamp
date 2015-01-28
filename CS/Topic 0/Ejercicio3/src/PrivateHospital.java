// los concret builders son los que le ponen la logica de construccion a cada hospital en particular
public class PrivateHospital implements HospitalBuilder {

	private Hospital hospital;

	public PrivateHospital() {
		hospital = new Hospital();
	}

	public Hospital getHospital() {

		return hospital;
	}

	@Override
	public void buildFloor() {
		hospital.setFloor(4);
	}

	@Override
	public void buildBedRoom() {
		hospital.setBedroom(50);
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
		hospital.setMaternityWard('N');
	}

	@Override
	public void buildElevator() {
		hospital.setElevator('Y');
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
