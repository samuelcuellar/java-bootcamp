public abstract class Forma {
	private String color;
	private boolean relleno;

	public Forma() {
		this.color = "negro";
		this.relleno = false;
	}

	public Forma(String color, boolean relleno) {
		this.setColor(color);
		this.setRelleno(relleno);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/*
	 * public boolean esLleno(){ return relleno; }
	 */

	public boolean isRelleno() {
		return relleno;
	}

	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}

	abstract double getArea();

	abstract double getPerimetro();

	@Override
	public String toString() {
		String a = "sin ";
		if (relleno) {
			a = "con ";
		}
		return "color= " + color + ", " + a + "Relleno";
	}
}
