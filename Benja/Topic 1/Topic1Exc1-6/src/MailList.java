public abstract class MailList {

	private static String[] list = { "gustavoFrings@gerencia.com" };

	public static void notification(String message) {
		for (int j = 0; j < list.length; j++) {
			System.out.println("\n***A notification has been send to: "
					+ list[j] + "\nmessage: " + message + "\n");
		}
	}
}
