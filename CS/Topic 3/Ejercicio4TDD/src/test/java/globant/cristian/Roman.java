package globant.cristian;

public class Roman {

	private String number_int;

	public Roman(String number_int) {
		this.number_int = number_int;

	}

	public int toInt() {
		
		if(number_int.equals("I"))
				return 1;
		else

		if (number_int.equals("II"))
			return 2;
		else if (number_int.equals("III"))
			return 3;
		else if (number_int.equals("IV"))
			return 4;
		else if (number_int.equals("V"))
			return 5;
		else if (number_int.equals("VI"))
			return 6;
		else if (number_int.equals("VII"))
			return 7;
		else if (number_int.equals("VIII"))
			return 8;
		else if (number_int.equals("IX"))
			return 9;
		else if (number_int.equals("X"))
			return 10;
		else if (number_int.equals("L"))
			return 50;
		else if (number_int.equals("C"))
			return 100;
		else if (number_int.equals("D"))
			return 500;
		else
		return 1000;
	}
}
