package bootcamp.benja.controller;

public class GlobalController {

	protected static long sesionId = 0;

	public static void setSesionId(long l) {
		sesionId = l;
	}
	
	public static long getSesionId() {
		return sesionId;
	}
}
