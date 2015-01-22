public class Hospital {

	private int floor;
	private int bedroom;
	private char IntensiveCareUnit;
	private char WaitingRoom;
	private char EmergencyRoom;
	private char MaternityWard;
	private char Elevator;
	private char OperatingRoom;
	private char RecoveryRoom;

	public Hospital() {
		floor = 2;
		bedroom = 60;
		IntensiveCareUnit = 'S';
		WaitingRoom = 'S';
		EmergencyRoom = 'S';
		MaternityWard = 'N';
		Elevator = 'N';
		OperatingRoom = 'S';
		RecoveryRoom = 'N';
	}

	public Hospital(int floor, int bedroom, char intensiveCareUnit, char waitingRoom, char emergencyRoom, char maternityWard,
			char elevator, char operatingRoom, char recoveryRoom) {

		this.floor = floor;
		this.bedroom = bedroom;
		IntensiveCareUnit = intensiveCareUnit;
		WaitingRoom = waitingRoom;
		EmergencyRoom = emergencyRoom;
		MaternityWard = maternityWard;
		Elevator = elevator;
		OperatingRoom = operatingRoom;
		RecoveryRoom = recoveryRoom;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getBedroom() {
		return bedroom;
	}

	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}

	public char getIntensiveCareUnit() {
		return IntensiveCareUnit;
	}

	public void setIntensiveCareUnit(char intensiveCareUnit) {
		IntensiveCareUnit = intensiveCareUnit;
	}

	public char getWaitingRoom() {
		return WaitingRoom;
	}

	public void setWaitingRoom(char waitingRoom) {
		WaitingRoom = waitingRoom;
	}

	public char getEmergencyRoom() {
		return EmergencyRoom;
	}

	public void setEmergencyRoom(char emergencyRoom) {
		EmergencyRoom = emergencyRoom;
	}

	public char getMaternityWard() {
		return MaternityWard;
	}

	public void setMaternityWard(char maternityWard) {
		MaternityWard = maternityWard;
	}

	public char getElevator() {
		return Elevator;
	}

	public void setElevator(char elevator) {
		Elevator = elevator;
	}

	public char getOperatingRoom() {
		return OperatingRoom;
	}

	public void setOperatingRoom(char operatingRoom) {
		OperatingRoom = operatingRoom;
	}

	public char getRecoveryRoom() {
		return RecoveryRoom;
	}

	public void setRecoveryRoom(char recoveryRoom) {
		RecoveryRoom = recoveryRoom;
	}

	public String toString() {
		return "Floor Number= " + floor + " Room Number= " + bedroom + " IntensiveCareUnit= " + IntensiveCareUnit + " WaitingRoom= "
				+ WaitingRoom + " EmergencyRoom= " + EmergencyRoom + " MaternityWard= " + MaternityWard + " Elevator= " + Elevator
				+ " Operating Room= " + OperatingRoom + " Recovery Room= " + RecoveryRoom;
	}

}
