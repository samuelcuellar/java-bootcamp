package globant.cristian;

public class Check {

	private int number;

	public Check(int number) {
		this.number = number;

	}

	public String toText() {

		if (number == 10)
			return "Diez";
		else if (number == 9)
			return "Nueve";
		else if (number == 8)
			return "Ocho";
		else if (number == 7)
			return "Siete";
		else if (number == 6)
			return "Seis";
		else if (number == 5)
			return "Cinco";
		else if (number == 4)
			return "Cuatro";
		else if (number == 3)
			return "Tres";
		else if (number == 2)
			return "Dos";
		else if (number == 1)
			return "Uno";
		return null;

	}

}
